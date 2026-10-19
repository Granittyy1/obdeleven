package com.google.firebase.sessions.api;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.i;
import kotlinx.coroutines.sync.MutexImpl;

/* JADX INFO: compiled from: FirebaseSessionsDependencies.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f28674a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Map<SessionSubscriber.Name, C0285a> f28675b = Collections.synchronizedMap(new LinkedHashMap());

    /* JADX INFO: renamed from: com.google.firebase.sessions.api.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: FirebaseSessionsDependencies.kt */
    public static final class C0285a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final MutexImpl f28676a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public SessionSubscriber f28677b = null;

        public C0285a(MutexImpl mutexImpl) {
            this.f28676a = mutexImpl;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0285a)) {
                return false;
            }
            C0285a c0285a = (C0285a) obj;
            return this.f28676a.equals(c0285a.f28676a) && i.a(this.f28677b, c0285a.f28677b);
        }

        public final int hashCode() {
            int iHashCode = this.f28676a.hashCode() * 31;
            SessionSubscriber sessionSubscriber = this.f28677b;
            return iHashCode + (sessionSubscriber == null ? 0 : sessionSubscriber.hashCode());
        }

        public final String toString() {
            return "Dependency(mutex=" + this.f28676a + ", subscriber=" + this.f28677b + ')';
        }
    }

    public static C0285a a(SessionSubscriber.Name name) {
        Map<SessionSubscriber.Name, C0285a> dependencies = f28675b;
        i.d(dependencies, "dependencies");
        C0285a c0285a = dependencies.get(name);
        if (c0285a != null) {
            return c0285a;
        }
        throw new IllegalStateException("Cannot get dependency " + name + ". Dependencies should be added at class load time.");
    }

    /* JADX WARN: Code duplicated, block: B:17:0x006f  */
    /* JADX WARN: Code duplicated, block: B:19:0x009c A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:20:0x009d  */
    /* JADX WARN: Code duplicated, block: B:23:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x009d -> B:30:0x009e). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object b(kotlin.coroutines.jvm.internal.ContinuationImpl r11) {
        /*
            Method dump skipped, instruction units count: 210
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.sessions.api.a.b(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
