package io.ktor.utils.io.internal;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.i;

/* JADX INFO: compiled from: SequentialCopyTo.kt */
/* JADX INFO: loaded from: classes.dex */
public final class h {
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Long a(io.ktor.utils.io.b bVar, io.ktor.utils.io.b bVar2, long j, ContinuationImpl continuationImpl) {
        SequentialCopyToKt$copyToSequentialImpl$1 sequentialCopyToKt$copyToSequentialImpl$1;
        long j10;
        long j11;
        io.ktor.utils.io.b bVar3;
        io.ktor.utils.io.b bVar4;
        long j12;
        long j13;
        if (continuationImpl instanceof SequentialCopyToKt$copyToSequentialImpl$1) {
            sequentialCopyToKt$copyToSequentialImpl$1 = (SequentialCopyToKt$copyToSequentialImpl$1) continuationImpl;
            int i10 = sequentialCopyToKt$copyToSequentialImpl$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                sequentialCopyToKt$copyToSequentialImpl$1.label = i10 - Integer.MIN_VALUE;
            } else {
                sequentialCopyToKt$copyToSequentialImpl$1 = new SequentialCopyToKt$copyToSequentialImpl$1(continuationImpl);
            }
        } else {
            sequentialCopyToKt$copyToSequentialImpl$1 = new SequentialCopyToKt$copyToSequentialImpl$1(continuationImpl);
        }
        Object obj = sequentialCopyToKt$copyToSequentialImpl$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i11 = sequentialCopyToKt$copyToSequentialImpl$1.label;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 == 2) {
                    j = sequentialCopyToKt$copyToSequentialImpl$1.J$1;
                    j11 = sequentialCopyToKt$copyToSequentialImpl$1.J$0;
                    bVar3 = (io.ktor.utils.io.b) sequentialCopyToKt$copyToSequentialImpl$1.L$1;
                    bVar4 = (io.ktor.utils.io.b) sequentialCopyToKt$copyToSequentialImpl$1.L$0;
                    kotlin.b.b(obj);
                    long jLongValue = ((Number) obj).longValue();
                    if (jLongValue != 0) {
                        j12 = j11;
                        j13 = jLongValue;
                    }
                } else {
                    if (i11 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    j13 = sequentialCopyToKt$copyToSequentialImpl$1.J$2;
                    j = sequentialCopyToKt$copyToSequentialImpl$1.J$1;
                    long j14 = sequentialCopyToKt$copyToSequentialImpl$1.J$0;
                    bVar3 = (io.ktor.utils.io.b) sequentialCopyToKt$copyToSequentialImpl$1.L$1;
                    io.ktor.utils.io.b bVar5 = (io.ktor.utils.io.b) sequentialCopyToKt$copyToSequentialImpl$1.L$0;
                    kotlin.b.b(obj);
                    j12 = j14;
                    bVar4 = bVar5;
                }
                j10 = j12;
                j -= j13;
                if (j13 > 0) {
                    bVar3.getClass();
                    throw null;
                }
                bVar2 = bVar3;
                bVar = bVar4;
            } else {
                j = sequentialCopyToKt$copyToSequentialImpl$1.J$1;
                j11 = sequentialCopyToKt$copyToSequentialImpl$1.J$0;
                io.ktor.utils.io.b dst = (io.ktor.utils.io.b) sequentialCopyToKt$copyToSequentialImpl$1.L$1;
                io.ktor.utils.io.b bVar6 = (io.ktor.utils.io.b) sequentialCopyToKt$copyToSequentialImpl$1.L$0;
                kotlin.b.b(obj);
                if (((Boolean) obj).booleanValue()) {
                    bVar6.getClass();
                    i.e(dst, "dst");
                    throw null;
                }
            }
            return new Long(j11 - j);
        }
        kotlin.b.b(obj);
        if (bVar == bVar2) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (bVar.q() != null) {
            bVar2.a(bVar.q());
            return new Long(0L);
        }
        j10 = j;
        if (j <= 0) {
            j11 = j10;
            return new Long(j11 - j);
        }
        sequentialCopyToKt$copyToSequentialImpl$1.L$0 = bVar;
        sequentialCopyToKt$copyToSequentialImpl$1.L$1 = bVar2;
        sequentialCopyToKt$copyToSequentialImpl$1.J$0 = j10;
        sequentialCopyToKt$copyToSequentialImpl$1.J$1 = j;
        sequentialCopyToKt$copyToSequentialImpl$1.label = 1;
        bVar.getClass();
        throw null;
    }
}
