package com.google.gson.internal;

import A1.p;
import A1.t;
import com.google.common.collect.ImmutableList;
import java.util.LinkedHashSet;
import org.koin.core.definition.BeanDefinition;
import p091h2.C2207g;
import p091h2.E;
import p114j1.w;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class b implements f, t, j1.j.a {
    public static Pb.b a(BeanDefinition beanDefinition, Nb.a aVar) {
        aVar.b(new org.koin.core.instance.a(beanDefinition));
        return Qb.b.a.a();
    }

    public static String b(long j, String str) {
        return str + j;
    }

    public static void e(int i10, String str) {
        p114j1.k.f(str + i10);
    }

    @Override // A1.t
    public p[] c() {
        return new p[]{new E(1, X1.l.a.f7151a, new w(0L), new C2207g(ImmutableList.K()))};
    }

    @Override // com.google.gson.internal.f
    public Object i() {
        return new LinkedHashSet();
    }

    @Override // j1.j.a
    public void invoke(Object obj) {
        ((p162n1.b) obj).getClass();
    }
}
