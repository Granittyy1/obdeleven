package com.voltasit.obdeleven.domain.exceptions;

/* JADX INFO: compiled from: PopTheHoodRequiredException.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class PopTheHoodRequiredException extends Exception {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final PopTheHoodRequiredException f30422b = new PopTheHoodRequiredException();

    private PopTheHoodRequiredException() {
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof PopTheHoodRequiredException);
    }

    public final int hashCode() {
        return -257788587;
    }

    @Override // java.lang.Throwable
    public final String toString() {
        return "PopTheHoodRequiredException";
    }
}
