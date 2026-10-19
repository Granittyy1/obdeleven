package com.google.firebase.abt.component;

import B7.g;
import H6.c;
import android.content.Context;
import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;
import p167n6.a;
import p228s6.b;
import p228s6.j;

/* JADX INFO: loaded from: classes3.dex */
@Keep
public class AbtRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-abt";

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ a lambda$getComponents$0(b bVar) {
        return new a((Context) bVar.a(Context.class), bVar.d(p192p6.a.class));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<p228s6.a<?>> getComponents() {
        p228s6.a.C0531a c0531aA = p228s6.a.a(a.class);
        c0531aA.f46937a = LIBRARY_NAME;
        c0531aA.a(j.b(Context.class));
        c0531aA.a(j.a(p192p6.a.class));
        c0531aA.f46942f = new c(5);
        return Arrays.asList(c0531aA.b(), g.a(LIBRARY_NAME, "21.1.1"));
    }
}
