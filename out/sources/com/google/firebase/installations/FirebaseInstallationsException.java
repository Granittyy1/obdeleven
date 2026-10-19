package com.google.firebase.installations;

import com.google.firebase.FirebaseException;

/* JADX INFO: loaded from: classes3.dex */
public class FirebaseInstallationsException extends FirebaseException {
    private final Status status;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class Status {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final Status f28198b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final Status f28199c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final Status f28200d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ Status[] f28201e;

        static {
            Status status = new Status("BAD_CONFIG", 0);
            f28198b = status;
            Status status2 = new Status("UNAVAILABLE", 1);
            f28199c = status2;
            Status status3 = new Status("TOO_MANY_REQUESTS", 2);
            f28200d = status3;
            f28201e = new Status[]{status, status2, status3};
        }

        public Status() {
            throw null;
        }

        public static Status valueOf(String str) {
            return (Status) Enum.valueOf(Status.class, str);
        }

        public static Status[] values() {
            return (Status[]) f28201e.clone();
        }
    }

    public FirebaseInstallationsException() {
        this.status = Status.f28198b;
    }

    public FirebaseInstallationsException(String str, Status status) {
        super(str);
        this.status = status;
    }
}
