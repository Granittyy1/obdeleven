package com.google.firebase.sessions.api;

import B7.b;
import kotlin.jvm.internal.i;

/* JADX INFO: compiled from: SessionSubscriber.kt */
/* JADX INFO: loaded from: classes3.dex */
public interface SessionSubscriber {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: SessionSubscriber.kt */
    public static final class Name {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final Name f28670b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final Name f28671c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ Name[] f28672d;

        static {
            Name name = new Name("CRASHLYTICS", 0);
            f28670b = name;
            Name name2 = new Name("PERFORMANCE", 1);
            f28671c = name2;
            f28672d = new Name[]{name, name2, new Name("MATT_SAYS_HI", 2)};
        }

        public Name() {
            throw null;
        }

        public static Name valueOf(String str) {
            return (Name) Enum.valueOf(Name.class, str);
        }

        public static Name[] values() {
            return (Name[]) f28672d.clone();
        }
    }

    /* JADX INFO: compiled from: SessionSubscriber.kt */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f28673a;

        public a(String sessionId) {
            i.e(sessionId, "sessionId");
            this.f28673a = sessionId;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && i.a(this.f28673a, ((a) obj).f28673a);
        }

        public final int hashCode() {
            return this.f28673a.hashCode();
        }

        public final String toString() {
            return b.g(new StringBuilder("SessionDetails(sessionId="), this.f28673a, ')');
        }
    }

    boolean a();

    void b(a aVar);
}
