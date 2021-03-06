package com.googlecode.xm4was.threadmon;

public interface UnmanagedThreadMonitor {
    ThreadInfo[] getThreadInfos();
    
    // Note: ideally we would like to return the com.ibm.ws.runtime.metadata.MetaData instance for the
    //       application or module, but keeping the MetaData instance is dangerous because it may
    //       cause a class loader leak
    ModuleInfo getModuleInfoForUnmanagedThread(Thread thread);
}
