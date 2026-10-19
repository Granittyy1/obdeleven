package com.voltasit.obdeleven.data.repositories;

import G8.C0705g;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p304y9.D;

/* JADX INFO: compiled from: CountryRepository.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class f implements K8.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final K8.o f30344a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.voltasit.sharednetwork.a f30345b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final F8.c f30346c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ArrayList f30347d;

    public f(K8.o oVar, com.voltasit.sharednetwork.a aVar, F8.c cVar) {
        this.f30344a = oVar;
        this.f30345b = aVar;
        this.f30346c = cVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // K8.n
    public final Object a(ContinuationImpl continuationImpl) {
        CountryRepository$getCountries$1 countryRepository$getCountries$1;
        f fVar;
        if (continuationImpl instanceof CountryRepository$getCountries$1) {
            countryRepository$getCountries$1 = (CountryRepository$getCountries$1) continuationImpl;
            int i10 = countryRepository$getCountries$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                countryRepository$getCountries$1.label = i10 - Integer.MIN_VALUE;
            } else {
                countryRepository$getCountries$1 = new CountryRepository$getCountries$1(this, continuationImpl);
            }
        } else {
            countryRepository$getCountries$1 = new CountryRepository$getCountries$1(this, continuationImpl);
        }
        Object objV = countryRepository$getCountries$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i11 = countryRepository$getCountries$1.label;
        if (i11 == 0) {
            kotlin.b.b(objV);
            ArrayList arrayList = this.f30347d;
            if (arrayList != null) {
                return new C8.a.b(arrayList);
            }
            try {
                com.voltasit.sharednetwork.a aVar = this.f30345b;
                countryRepository$getCountries$1.L$0 = this;
                countryRepository$getCountries$1.label = 1;
                objV = aVar.v(countryRepository$getCountries$1);
                if (objV == coroutineSingletons) {
                    return coroutineSingletons;
                }
                fVar = this;
            } catch (Throwable th) {
                th = th;
                fVar = this;
                return E8.a.i(fVar.f30346c.a(th));
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            fVar = (f) countryRepository$getCountries$1.L$0;
            try {
                kotlin.b.b(objV);
            } catch (Throwable th2) {
                th = th2;
                return E8.a.i(fVar.f30346c.a(th));
            }
        }
        List<D> list = (List) objV;
        ArrayList arrayList2 = new ArrayList(kotlin.collections.m.y(list, 10));
        for (D d10 : list) {
            Locale locale = new Locale("", d10.f48437b);
            String str = "+" + d10.f48436a;
            String str2 = d10.f48437b;
            String displayCountry = locale.getDisplayCountry(fVar.f30344a.Y().f());
            kotlin.jvm.internal.i.b(displayCountry);
            arrayList2.add(new C0705g(displayCountry, str, str2));
        }
        fVar.f30347d = arrayList2;
        return new C8.a.b(arrayList2);
    }
}
