package com.google.firebase.crashlytics;

import B7.g;
import D7.i;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.sessions.api.SessionSubscriber;
import com.google.firebase.sessions.api.a;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import kotlinx.coroutines.sync.MutexImpl;
import p108i7.c;
import p228s6.j;
import p252u6.e;

/* JADX INFO: loaded from: classes3.dex */
public class CrashlyticsRegistrar implements ComponentRegistrar {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f28073a = 0;

    static {
        SessionSubscriber.Name name = SessionSubscriber.Name.f28670b;
        Map<SessionSubscriber.Name, a.C0285a> map = a.f28675b;
        if (map.containsKey(name)) {
            name.toString();
        } else {
            map.put(name, new a.C0285a(new MutexImpl(true)));
            name.toString();
        }
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public final List<p228s6.a<?>> getComponents() {
        p228s6.a.C0531a c0531aA = p228s6.a.a(e.class);
        c0531aA.f46937a = "fire-cls";
        c0531aA.a(j.b(p144l6.e.class));
        c0531aA.a(j.b(c.class));
        c0531aA.a(new j(0, 2, p264v6.a.class));
        c0531aA.a(new j(0, 2, p192p6.a.class));
        c0531aA.a(new j(0, 2, F7.a.class));
        c0531aA.f46942f = new i(this);
        c0531aA.c(2);
        return Arrays.asList(c0531aA.b(), g.a("fire-cls", "18.6.3"));
    }
}
