package com.voltasit.obdeleven.domain.usecases.oca;

import J8.p;
import com.voltasit.obdeleven.domain.exceptions.NotFoundException;
import java.util.ArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: GetOriginalAppValueCommandsUC.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final K8.j f30876a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i f30877b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p f30878c;

    public f(K8.j jVar, i iVar, p pVar) {
        this.f30876a = jVar;
        this.f30877b = iVar;
        this.f30878c = pVar;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:31:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:33:0x00d5 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object a(String str, String str2, ContinuationImpl continuationImpl) {
        GetOriginalAppValueCommandsUC$invoke$1 getOriginalAppValueCommandsUC$invoke$1;
        f fVar;
        String str3;
        I8.d dVar;
        f fVar2;
        K8.j jVar;
        String str4;
        if (continuationImpl instanceof GetOriginalAppValueCommandsUC$invoke$1) {
            getOriginalAppValueCommandsUC$invoke$1 = (GetOriginalAppValueCommandsUC$invoke$1) continuationImpl;
            int i10 = getOriginalAppValueCommandsUC$invoke$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                getOriginalAppValueCommandsUC$invoke$1.label = i10 - Integer.MIN_VALUE;
            } else {
                getOriginalAppValueCommandsUC$invoke$1 = new GetOriginalAppValueCommandsUC$invoke$1(this, continuationImpl);
            }
        } else {
            getOriginalAppValueCommandsUC$invoke$1 = new GetOriginalAppValueCommandsUC$invoke$1(this, continuationImpl);
        }
        Object objG = getOriginalAppValueCommandsUC$invoke$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i11 = getOriginalAppValueCommandsUC$invoke$1.label;
        if (i11 != 0) {
            if (i11 == 1) {
                str2 = (String) getOriginalAppValueCommandsUC$invoke$1.L$2;
                str = (String) getOriginalAppValueCommandsUC$invoke$1.L$1;
                fVar = (f) getOriginalAppValueCommandsUC$invoke$1.L$0;
                kotlin.b.b(objG);
            } else if (i11 == 2) {
                dVar = (I8.d) getOriginalAppValueCommandsUC$invoke$1.L$3;
                str2 = (String) getOriginalAppValueCommandsUC$invoke$1.L$2;
                str3 = (String) getOriginalAppValueCommandsUC$invoke$1.L$1;
                fVar2 = (f) getOriginalAppValueCommandsUC$invoke$1.L$0;
                kotlin.b.b(objG);
                if (((Boolean) objG).booleanValue()) {
                    return new C8.a.b(dVar.f3928b);
                }
                jVar = fVar2.f30876a;
                str4 = dVar.f3927a;
                getOriginalAppValueCommandsUC$invoke$1.L$0 = null;
                getOriginalAppValueCommandsUC$invoke$1.L$1 = null;
                getOriginalAppValueCommandsUC$invoke$1.L$2 = null;
                getOriginalAppValueCommandsUC$invoke$1.L$3 = null;
                getOriginalAppValueCommandsUC$invoke$1.label = 3;
                if (jVar.c(str3, str2, str4, getOriginalAppValueCommandsUC$invoke$1) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i11 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.b.b(objG);
            }
            return new C8.a.b(EmptyList.f42983b);
        }
        kotlin.b.b(objG);
        this.f30878c.f("GetOriginalAppValueCommandsUC", "GetOriginalAppValueCommandsUC(ocaId=" + str + ")");
        getOriginalAppValueCommandsUC$invoke$1.L$0 = this;
        getOriginalAppValueCommandsUC$invoke$1.L$1 = str;
        getOriginalAppValueCommandsUC$invoke$1.L$2 = str2;
        getOriginalAppValueCommandsUC$invoke$1.label = 1;
        objG = this.f30876a.g(str, str2, getOriginalAppValueCommandsUC$invoke$1);
        if (objG == coroutineSingletons) {
            return coroutineSingletons;
        }
        fVar = this;
        C8.a aVar = (C8.a) objG;
        if (!(aVar instanceof C8.a.b)) {
            if (aVar instanceof C8.a.C0024a) {
                return ((C8.a.C0024a) aVar).f2462a instanceof NotFoundException ? new C8.a.b(EmptyList.f42983b) : aVar;
            }
            throw new NoWhenBranchMatchedException();
        }
        I8.d dVar2 = (I8.d) ((C8.a.b) aVar).f2463a;
        i iVar = fVar.f30877b;
        ArrayList arrayList = dVar2.f3928b;
        getOriginalAppValueCommandsUC$invoke$1.L$0 = fVar;
        getOriginalAppValueCommandsUC$invoke$1.L$1 = str;
        getOriginalAppValueCommandsUC$invoke$1.L$2 = str2;
        getOriginalAppValueCommandsUC$invoke$1.L$3 = dVar2;
        getOriginalAppValueCommandsUC$invoke$1.label = 2;
        Object objA = iVar.a(str, arrayList, getOriginalAppValueCommandsUC$invoke$1);
        if (objA == coroutineSingletons) {
            return coroutineSingletons;
        }
        f fVar3 = fVar;
        str3 = str;
        dVar = dVar2;
        objG = objA;
        fVar2 = fVar3;
        if (((Boolean) objG).booleanValue()) {
            return new C8.a.b(dVar.f3928b);
        }
        jVar = fVar2.f30876a;
        str4 = dVar.f3927a;
        getOriginalAppValueCommandsUC$invoke$1.L$0 = null;
        getOriginalAppValueCommandsUC$invoke$1.L$1 = null;
        getOriginalAppValueCommandsUC$invoke$1.L$2 = null;
        getOriginalAppValueCommandsUC$invoke$1.L$3 = null;
        getOriginalAppValueCommandsUC$invoke$1.label = 3;
        if (jVar.c(str3, str2, str4, getOriginalAppValueCommandsUC$invoke$1) == coroutineSingletons) {
            return coroutineSingletons;
        }
        return new C8.a.b(EmptyList.f42983b);
    }
}
