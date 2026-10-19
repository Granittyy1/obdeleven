package io.reactivex.internal.util;

import java.io.Serializable;
import p123ja.n;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class NotificationLite {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final NotificationLite f40975b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ NotificationLite[] f40976c;

    public static final class ErrorNotification implements Serializable {
        private static final long serialVersionUID = -8759979445933046293L;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final Throwable f40977e;

        public ErrorNotification(Throwable th) {
            this.f40977e = th;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof ErrorNotification)) {
                return false;
            }
            Throwable th = this.f40977e;
            Throwable th2 = ((ErrorNotification) obj).f40977e;
            return th == th2 || (th != null && th.equals(th2));
        }

        public final int hashCode() {
            return this.f40977e.hashCode();
        }

        public final String toString() {
            return "NotificationLite.Error[" + this.f40977e + "]";
        }
    }

    static {
        NotificationLite notificationLite = new NotificationLite("COMPLETE", 0);
        f40975b = notificationLite;
        f40976c = new NotificationLite[]{notificationLite};
    }

    public NotificationLite() {
        throw null;
    }

    public static boolean a(n nVar, Object obj) {
        if (obj == f40975b) {
            nVar.a();
            return true;
        }
        if (obj instanceof ErrorNotification) {
            nVar.onError(((ErrorNotification) obj).f40977e);
            return true;
        }
        nVar.c(obj);
        return false;
    }

    public static Object b(Throwable th) {
        return new ErrorNotification(th);
    }

    public static Throwable c(Object obj) {
        return ((ErrorNotification) obj).f40977e;
    }

    public static NotificationLite valueOf(String str) {
        return (NotificationLite) Enum.valueOf(NotificationLite.class, str);
    }

    public static NotificationLite[] values() {
        return (NotificationLite[]) f40976c.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "NotificationLite.Complete";
    }
}
