package com.parse;

/* JADX INFO: loaded from: classes3.dex */
public class ParseException extends Exception {
    private static final long serialVersionUID = 1;
    private int code;

    public ParseException(int i10, String str) {
        super(str);
        this.code = i10;
    }

    public int getCode() {
        return this.code;
    }

    public ParseException(int i10, String str, Throwable th) {
        super(str, th);
        this.code = i10;
    }

    public ParseException(Throwable th) {
        super(th);
        this.code = -1;
    }
}
