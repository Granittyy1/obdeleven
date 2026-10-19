package com.google.common.base;

import com.braze.support.BrazeLogger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: Splitter.java */
/* JADX INFO: loaded from: classes3.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.google.common.base.a.c f27801a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f27802b;

    /* JADX INFO: compiled from: Splitter.java */
    public static abstract class a extends AbstractIterator<String> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final CharSequence f27803d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final com.google.common.base.a.c f27804e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f27805f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f27806g;

        public a(h hVar, CharSequence charSequence) {
            this.f27769b = AbstractIterator.State.f27772c;
            this.f27805f = 0;
            this.f27804e = hVar.f27801a;
            this.f27806g = BrazeLogger.SUPPRESS;
            this.f27803d = charSequence;
        }
    }

    public h(g gVar, com.google.common.base.a.c cVar) {
        this.f27802b = gVar;
        this.f27801a = cVar;
    }

    public static h a(char c10) {
        return new h(new g(new com.google.common.base.a.b(c10)), com.google.common.base.a.d.f27787c);
    }

    public final List<String> b(CharSequence charSequence) {
        charSequence.getClass();
        f fVar = new f(this.f27802b, this, charSequence);
        ArrayList arrayList = new ArrayList();
        while (fVar.hasNext()) {
            arrayList.add(fVar.next());
        }
        return Collections.unmodifiableList(arrayList);
    }
}
