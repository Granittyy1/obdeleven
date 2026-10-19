package com.voltasit.obdeleven.data.extensions;

import A8.p;
import Ia.l;
import com.parse.boltsinternal.Task;
import com.parse.boltsinternal.TaskCompletionSource;
import kotlin.b;
import kotlin.coroutines.c;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.i;
import kotlinx.coroutines.C2673a0;
import kotlinx.coroutines.C2680e;
import kotlinx.coroutines.C2693i;

/* JADX INFO: compiled from: ParseTaskExtensions.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class ParseTaskExtensionsKt {
    public static final <T> Task<T> a(l<? super c<? super T>, ? extends Object> lVar) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        C2680e.c(C2673a0.f43223b, null, null, new ParseTaskExtensionsKt$coroutineToTask$1(lVar, taskCompletionSource, null), 3);
        Task<T> task = taskCompletionSource.getTask();
        i.d(task, "getTask(...)");
        return task;
    }

    public static final Object b(Task task, ContinuationImpl continuationImpl) {
        C2693i c2693i = new C2693i(1, p.y(continuationImpl));
        c2693i.s();
        task.continueWith(new a(task, c2693i));
        Object objP = c2693i.p();
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        return objP;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object c(Task task, ContinuationImpl continuationImpl) {
        ParseTaskExtensionsKt$suspendResult$1 parseTaskExtensionsKt$suspendResult$1;
        if (continuationImpl instanceof ParseTaskExtensionsKt$suspendResult$1) {
            parseTaskExtensionsKt$suspendResult$1 = (ParseTaskExtensionsKt$suspendResult$1) continuationImpl;
            int i10 = parseTaskExtensionsKt$suspendResult$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                parseTaskExtensionsKt$suspendResult$1.label = i10 - Integer.MIN_VALUE;
            } else {
                parseTaskExtensionsKt$suspendResult$1 = new ParseTaskExtensionsKt$suspendResult$1(continuationImpl);
            }
        } else {
            parseTaskExtensionsKt$suspendResult$1 = new ParseTaskExtensionsKt$suspendResult$1(continuationImpl);
        }
        Object objB = parseTaskExtensionsKt$suspendResult$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i11 = parseTaskExtensionsKt$suspendResult$1.label;
        try {
            if (i11 == 0) {
                b.b(objB);
                parseTaskExtensionsKt$suspendResult$1.label = 1;
                objB = b(task, parseTaskExtensionsKt$suspendResult$1);
                if (objB == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                b.b(objB);
            }
            return objB;
        } catch (Throwable th) {
            return b.a(th);
        }
    }
}
