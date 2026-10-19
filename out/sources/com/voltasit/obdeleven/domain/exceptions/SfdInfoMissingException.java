package com.voltasit.obdeleven.domain.exceptions;

/* JADX INFO: compiled from: SfdInfoMissingException.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class SfdInfoMissingException extends Exception {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final SfdInfoMissingException f30425b = new SfdInfoMissingException();

    private SfdInfoMissingException() {
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof SfdInfoMissingException);
    }

    public final int hashCode() {
        return 1478686985;
    }

    @Override // java.lang.Throwable
    public final String toString() {
        return "SfdInfoMissingException";
    }
}
