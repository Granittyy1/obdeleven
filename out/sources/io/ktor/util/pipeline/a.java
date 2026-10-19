package io.ktor.util.pipeline;

import Ia.q;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.o;
import p293xa.r;

/* JADX INFO: compiled from: PhaseContent.kt */
/* JADX INFO: loaded from: classes.dex */
public final class a<TSubject, Call> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final ArrayList f40552e = new ArrayList();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final P3.b f40553a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f40554b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public List<q<c<TSubject, Call>, TSubject, kotlin.coroutines.c<? super r>, Object>> f40555c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f40556d;

    public a() {
        throw null;
    }

    public a(P3.b phase, e relation) {
        i.e(phase, "phase");
        i.e(relation, "relation");
        ArrayList arrayList = f40552e;
        i.c(arrayList, "null cannot be cast to non-null type kotlin.collections.MutableList<kotlin.Function3<io.ktor.util.pipeline.PipelineContext<TSubject of io.ktor.util.pipeline.PhaseContent, Call of io.ktor.util.pipeline.PhaseContent>, TSubject of io.ktor.util.pipeline.PhaseContent, kotlin.coroutines.Continuation<kotlin.Unit>, kotlin.Any?>{ io.ktor.util.pipeline.PipelineKt.PipelineInterceptorFunction<TSubject of io.ktor.util.pipeline.PhaseContent, Call of io.ktor.util.pipeline.PhaseContent> }>");
        List<q<c<TSubject, Call>, TSubject, kotlin.coroutines.c<? super r>, Object>> interceptors = o.b(arrayList);
        i.e(interceptors, "interceptors");
        this.f40553a = phase;
        this.f40554b = relation;
        this.f40555c = interceptors;
        this.f40556d = true;
        if (!arrayList.isEmpty()) {
            throw new IllegalStateException("The shared empty array list has been modified");
        }
    }

    public final void a(q<? super c<TSubject, Call>, ? super TSubject, ? super kotlin.coroutines.c<? super r>, ? extends Object> qVar) {
        if (this.f40556d) {
            ArrayList arrayList = new ArrayList();
            arrayList.addAll(this.f40555c);
            this.f40555c = arrayList;
            this.f40556d = false;
        }
        this.f40555c.add(qVar);
    }

    public final String toString() {
        return "Phase `" + ((String) this.f40553a.f4915b) + "`, " + this.f40555c.size() + " handlers";
    }
}
