package com.voltasit.obdeleven.domain.usecases;

import com.parse.ParseConfig;
import com.voltasit.obdeleven.domain.exceptions.ParseConfigNotFoundException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.C2680e;
import kotlinx.coroutines.N;

/* JADX INFO: compiled from: GetParseConfigUC.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final J8.p f30864a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f30865b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f30866c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final F8.c f30867d;

    public n(J8.p pVar, e eVar, d dVar, F8.c cVar) {
        this.f30864a = pVar;
        this.f30865b = eVar;
        this.f30866c = dVar;
        this.f30867d = cVar;
    }

    public final C8.a<p293xa.r> a() {
        this.f30866c.getClass();
        return ParseConfig.getCurrentConfig().getInt("app_version", 0) != 0 ? new C8.a.b(p293xa.r.f47939a) : new C8.a.C0024a(ParseConfigNotFoundException.f30414b);
    }

    /* JADX WARN: Code duplicated, block: B:30:0x007a  */
    /* JADX WARN: Code duplicated, block: B:34:0x0089  */
    /* JADX WARN: Code duplicated, block: B:36:0x008d  */
    /* JADX WARN: Code duplicated, block: B:37:0x0093  */
    /* JADX WARN: Code duplicated, block: B:47:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(ContinuationImpl continuationImpl) {
        GetParseConfigUC$invoke$1 getParseConfigUC$invoke$1;
        n nVar;
        Throwable thA;
        C8.a<p293xa.r> aVarA;
        if (continuationImpl instanceof GetParseConfigUC$invoke$1) {
            getParseConfigUC$invoke$1 = (GetParseConfigUC$invoke$1) continuationImpl;
            int i10 = getParseConfigUC$invoke$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                getParseConfigUC$invoke$1.label = i10 - Integer.MIN_VALUE;
            } else {
                getParseConfigUC$invoke$1 = new GetParseConfigUC$invoke$1(this, continuationImpl);
            }
        } else {
            getParseConfigUC$invoke$1 = new GetParseConfigUC$invoke$1(this, continuationImpl);
        }
        Object obj = getParseConfigUC$invoke$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i11 = getParseConfigUC$invoke$1.label;
        if (i11 == 0) {
            kotlin.b.b(obj);
            this.f30864a.f("GetParseConfigUC", "GetParseConfigUC()");
            if (!com.voltasit.obdeleven.domain.usecases.device.u.k(this.f30865b.f30831a.getContext())) {
                return a();
            }
            try {
                Sa.a aVar = N.f43200c;
                GetParseConfigUC$invoke$2 getParseConfigUC$invoke$2 = new GetParseConfigUC$invoke$2(2, null);
                getParseConfigUC$invoke$1.L$0 = this;
                getParseConfigUC$invoke$1.label = 1;
                if (C2680e.f(aVar, getParseConfigUC$invoke$2, getParseConfigUC$invoke$1) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                nVar = this;
            } catch (Throwable th) {
                th = th;
                nVar = this;
                thA = nVar.f30867d.a(th);
                if (th.equals(thA)) {
                    nVar.f30864a.d(th, false);
                }
                aVarA = nVar.a();
                if (aVarA instanceof C8.a.b) {
                    return aVarA;
                }
                if (aVarA instanceof C8.a.C0024a) {
                    return new C8.a.C0024a(thA);
                }
                throw new NoWhenBranchMatchedException();
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            nVar = (n) getParseConfigUC$invoke$1.L$0;
            try {
                kotlin.b.b(obj);
            } catch (Throwable th2) {
                th = th2;
                thA = nVar.f30867d.a(th);
                if (th.equals(thA)) {
                    nVar.f30864a.d(th, false);
                }
                aVarA = nVar.a();
                if (aVarA instanceof C8.a.b) {
                    return aVarA;
                }
                if (aVarA instanceof C8.a.C0024a) {
                    return new C8.a.C0024a(thA);
                }
                throw new NoWhenBranchMatchedException();
            }
        }
        return new C8.a.b(p293xa.r.f47939a);
    }
}
