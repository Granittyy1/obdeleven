package com.google.firebase.remoteconfig;

import B7.g;
import C7.o;
import android.content.Context;
import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import p108i7.c;
import p144l6.e;
import p167n6.a;
import p228s6.b;
import p228s6.j;
import p228s6.p;

/* JADX INFO: loaded from: classes3.dex */
@Keep
public class RemoteConfigRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-rc";

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ o lambda$getComponents$0(p pVar, b bVar) {
        return new o((Context) bVar.a(Context.class), (ScheduledExecutorService) bVar.c(pVar), (e) bVar.a(e.class), (c) bVar.a(c.class), ((a) bVar.a(a.class)).a("frc"), bVar.d(p192p6.a.class));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<p228s6.a<?>> getComponents() {
        p pVar = new p(p217r6.b.class, ScheduledExecutorService.class);
        p228s6.a.C0531a c0531a = new p228s6.a.C0531a(o.class, new Class[]{F7.a.class});
        c0531a.f46937a = LIBRARY_NAME;
        c0531a.a(j.b(Context.class));
        c0531a.a(new j((p<?>) pVar, 1, 0));
        c0531a.a(j.b(e.class));
        c0531a.a(j.b(c.class));
        c0531a.a(j.b(a.class));
        c0531a.a(j.a(p192p6.a.class));
        c0531a.f46942f = new A4.b(pVar);
        c0531a.c(2);
        return Arrays.asList(c0531a.b(), g.a(LIBRARY_NAME, "21.6.3"));
    }
}
