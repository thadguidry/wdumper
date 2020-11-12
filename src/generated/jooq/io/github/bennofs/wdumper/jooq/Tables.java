/*
 * This file is generated by jOOQ.
 */
package io.github.bennofs.wdumper.jooq;


import io.github.bennofs.wdumper.jooq.tables.DB_Databasechangelog;
import io.github.bennofs.wdumper.jooq.tables.DB_Databasechangeloglock;
import io.github.bennofs.wdumper.jooq.tables.DB_Dump;
import io.github.bennofs.wdumper.jooq.tables.DB_DumpError;
import io.github.bennofs.wdumper.jooq.tables.DB_Run;
import io.github.bennofs.wdumper.jooq.tables.DB_Zenodo;


/**
 * Convenience access to all tables in
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Tables {

    /**
     * The table <code>DATABASECHANGELOG</code>.
     */
    public static final DB_Databasechangelog DATABASECHANGELOG = DB_Databasechangelog.DATABASECHANGELOG;

    /**
     * The table <code>DATABASECHANGELOGLOCK</code>.
     */
    public static final DB_Databasechangeloglock DATABASECHANGELOGLOCK = DB_Databasechangeloglock.DATABASECHANGELOGLOCK;

    /**
     * The table <code>dump</code>.
     */
    public static final DB_Dump DUMP = DB_Dump.DUMP;

    /**
     * The table <code>dump_error</code>.
     */
    public static final DB_DumpError DUMP_ERROR = DB_DumpError.DUMP_ERROR;

    /**
     * The table <code>run</code>.
     */
    public static final DB_Run RUN = DB_Run.RUN;

    /**
     * The table <code>zenodo</code>.
     */
    public static final DB_Zenodo ZENODO = DB_Zenodo.ZENODO;
}
