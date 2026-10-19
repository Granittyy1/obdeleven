package com.google.firebase.messaging;

import com.google.firebase.messaging.reporting.MessagingClientEvent;
import java.util.HashMap;

/* JADX INFO: compiled from: ProtoEncoderDoNotUse.java */
/* JADX INFO: loaded from: classes3.dex */
public abstract class A {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final O6.e f28264a;

    static {
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        O6.d dVar = O6.e.a.f4866a;
        map.put(A.class, C2040c.f28361a);
        map2.remove(A.class);
        map.put(o7.a.class, C2039b.f28359a);
        map2.remove(o7.a.class);
        map.put(MessagingClientEvent.class, C2038a.f28344a);
        map2.remove(MessagingClientEvent.class);
        f28264a = new O6.e(new HashMap(map), new HashMap(map2), dVar);
    }

    public abstract o7.a a();
}
