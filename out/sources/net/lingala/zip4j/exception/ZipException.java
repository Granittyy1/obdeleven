package net.lingala.zip4j.exception;

import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public class ZipException extends Exception {
    private static final long serialVersionUID = 1;
    private int code;

    public ZipException() {
        this.code = -1;
    }

    public ZipException(String str) {
        super(str);
        this.code = -1;
    }

    public ZipException(IOException iOException) {
        super("IOException when reading short buff", iOException);
        this.code = -1;
    }

    public ZipException(String str, int i10) {
        super(str);
        this.code = i10;
    }

    public ZipException(IOException iOException, int i10) {
        super("Probably not a zip file or a corrupted zip file", iOException);
        this.code = 4;
    }

    public ZipException(Exception exc) {
        super(exc);
        this.code = -1;
    }
}
