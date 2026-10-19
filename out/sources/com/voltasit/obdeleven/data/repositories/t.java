package com.voltasit.obdeleven.data.repositories;

import android.util.Base64;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: SfdRepositoryImpl.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class t implements K8.r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.voltasit.sharednetwork.a f30386a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final F8.c f30387b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final J8.i f30388c;

    public t(com.voltasit.sharednetwork.a aVar, F8.c cVar, J8.i iVar) {
        this.f30386a = aVar;
        this.f30387b = cVar;
        this.f30388c = iVar;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0016  */
    @Override // K8.r
    public final Object a(String str, String str2, byte[] bArr, ContinuationImpl continuationImpl) {
        SfdRepositoryImpl$getSfdToken$1 sfdRepositoryImpl$getSfdToken$1;
        t tVar;
        byte[] bArr2;
        J8.i iVar = this.f30388c;
        if (continuationImpl instanceof SfdRepositoryImpl$getSfdToken$1) {
            sfdRepositoryImpl$getSfdToken$1 = (SfdRepositoryImpl$getSfdToken$1) continuationImpl;
            int i10 = sfdRepositoryImpl$getSfdToken$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                sfdRepositoryImpl$getSfdToken$1.label = i10 - Integer.MIN_VALUE;
            } else {
                sfdRepositoryImpl$getSfdToken$1 = new SfdRepositoryImpl$getSfdToken$1(this, continuationImpl);
            }
        } else {
            sfdRepositoryImpl$getSfdToken$1 = new SfdRepositoryImpl$getSfdToken$1(this, continuationImpl);
        }
        SfdRepositoryImpl$getSfdToken$1 sfdRepositoryImpl$getSfdToken$2 = sfdRepositoryImpl$getSfdToken$1;
        Object obj = sfdRepositoryImpl$getSfdToken$2.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i11 = sfdRepositoryImpl$getSfdToken$2.label;
        if (i11 == 0) {
            kotlin.b.b(obj);
            try {
                byte[] bytes = iVar.c(8).getBytes(kotlin.text.a.f43120b);
                kotlin.jvm.internal.i.d(bytes, "getBytes(...)");
                byte[] bArrD = iVar.d();
                String strEncodeToString = Base64.encodeToString(iVar.f(bArr, bytes, bArrD), 0);
                String strEncodeToString2 = Base64.encodeToString(bArrD, 0);
                com.voltasit.sharednetwork.a aVar = this.f30386a;
                kotlin.jvm.internal.i.b(strEncodeToString);
                kotlin.jvm.internal.i.b(strEncodeToString2);
                sfdRepositoryImpl$getSfdToken$2.L$0 = this;
                sfdRepositoryImpl$getSfdToken$2.L$1 = bytes;
                sfdRepositoryImpl$getSfdToken$2.label = 1;
                Object objF = aVar.F(str, str2, strEncodeToString, strEncodeToString2, sfdRepositoryImpl$getSfdToken$2);
                if (objF == coroutineSingletons) {
                    return coroutineSingletons;
                }
                tVar = this;
                obj = objF;
                bArr2 = bytes;
            } catch (Throwable th) {
                th = th;
                tVar = this;
                return new C8.a.C0024a(tVar.f30387b.a(th));
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bArr2 = (byte[]) sfdRepositoryImpl$getSfdToken$2.L$1;
            tVar = (t) sfdRepositoryImpl$getSfdToken$2.L$0;
            try {
                kotlin.b.b(obj);
            } catch (Throwable th2) {
                th = th2;
                return new C8.a.C0024a(tVar.f30387b.a(th));
            }
        }
        A9.m mVar = (A9.m) obj;
        byte[] bArrDecode = Base64.decode(mVar.f1022a, 0);
        byte[] bArrDecode2 = Base64.decode(mVar.f1023b, 0);
        J8.i iVar2 = tVar.f30388c;
        kotlin.jvm.internal.i.b(bArrDecode);
        kotlin.jvm.internal.i.b(bArrDecode2);
        return new C8.a.b(iVar2.e(bArrDecode, bArr2, bArrDecode2));
    }
}
