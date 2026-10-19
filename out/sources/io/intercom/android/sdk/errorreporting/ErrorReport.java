package io.intercom.android.sdk.errorreporting;

import I7.b;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class ErrorReport {

    @b("exception_reports")
    private final List<ExceptionReport> exceptionReports;
    private final long timestamp;

    public ErrorReport(List<ExceptionReport> list, long j) {
        this.exceptionReports = list;
        this.timestamp = j;
    }

    public List<ExceptionReport> getExceptionReports() {
        return this.exceptionReports;
    }

    public long getTimestamp() {
        return this.timestamp;
    }
}
