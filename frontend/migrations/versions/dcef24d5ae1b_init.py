"""init

Revision ID: dcef24d5ae1b
Revises: 
Create Date: 2019-07-14 23:17:22.705050

"""
from alembic import op
import sqlalchemy as sa


# revision identifiers, used by Alembic.
revision = 'dcef24d5ae1b'
down_revision = None
branch_labels = None
depends_on = None


def upgrade():
    # ### commands auto generated by Alembic - please adjust! ###
    op.create_table('run',
    sa.Column('id', sa.Integer(), nullable=False),
    sa.Column('started_at', sa.TIMESTAMP(), nullable=True),
    sa.Column('finished_at', sa.TIMESTAMP(), nullable=True),
    sa.Column('count', sa.Integer(), server_default=sa.text('0'), nullable=False),
    sa.PrimaryKeyConstraint('id', name=op.f('pk_run'))
    )
    op.create_table('dump',
    sa.Column('id', sa.Integer(), nullable=False),
    sa.Column('title', sa.UnicodeText(), nullable=False),
    sa.Column('spec', sa.Text(), nullable=False),
    sa.Column('created_at', sa.TIMESTAMP(), server_default=sa.text('now()'), nullable=False),
    sa.Column('run_id', sa.Integer(), nullable=True),
    sa.Column('completed_at', sa.TIMESTAMP(), nullable=True),
    sa.Column('zenodo_uri', sa.Text(), nullable=True),
    sa.ForeignKeyConstraint(['run_id'], ['run.id'], name=op.f('fk_dump_run_id_run')),
    sa.PrimaryKeyConstraint('id', name=op.f('pk_dump'))
    )
    op.create_index(op.f('ix_dump_completed_at'), 'dump', ['completed_at'], unique=False)
    op.create_index(op.f('ix_dump_created_at'), 'dump', ['created_at'], unique=False)
    op.create_table('dump_error',
    sa.Column('id', sa.Integer(), nullable=False),
    sa.Column('logged_at', sa.TIMESTAMP(), server_default=sa.text('now()'), nullable=False),
    sa.Column('dump_id', sa.Integer(), nullable=True),
    sa.Column('run_id', sa.Integer(), nullable=False),
    sa.Column('level', sa.Enum('CRITICAL', 'ERROR', 'WARNING', name='errorlevel'), nullable=False),
    sa.Column('message', sa.Text(), nullable=False),
    sa.ForeignKeyConstraint(['dump_id'], ['dump.id'], name=op.f('fk_dump_error_dump_id_dump')),
    sa.ForeignKeyConstraint(['run_id'], ['run.id'], name=op.f('fk_dump_error_run_id_run')),
    sa.PrimaryKeyConstraint('id', name=op.f('pk_dump_error'))
    )
    # ### end Alembic commands ###


def downgrade():
    # ### commands auto generated by Alembic - please adjust! ###
    op.drop_table('dump_error')
    op.drop_index(op.f('ix_dump_created_at'), table_name='dump')
    op.drop_index(op.f('ix_dump_completed_at'), table_name='dump')
    op.drop_table('dump')
    op.drop_table('run')
    # ### end Alembic commands ###
