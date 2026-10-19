package io.ktor.util.pipeline;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.i;
import kotlinx.coroutines.A;

/* JADX INFO: compiled from: PipelineContext.kt */
/* JADX INFO: loaded from: classes.dex */
public abstract class c<TSubject, TContext> implements A {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TContext f40561b;

    public c(TContext context) {
        i.e(context, "context");
        this.f40561b = context;
    }

    public abstract Object a(Object obj, ContinuationImpl continuationImpl);

    public abstract TSubject b();

    public abstract Object c(kotlin.coroutines.c<? super TSubject> cVar);

    public abstract Object d(TSubject tsubject, kotlin.coroutines.c<? super TSubject> cVar);
}
