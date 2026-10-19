package com.voltasit.obdeleven.domain.usecases.gateway;

import J8.j;
import androidx.collection.Y;
import com.obdeleven.service.model.f;
import com.voltasit.obdeleven.domain.exceptions.SecurityAccessException;
import com.voltasit.obdeleven.domain.models.Nrc;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.i;
import kotlinx.coroutines.I;
import p134k8.S0;
import p134k8.T0;

/* JADX INFO: compiled from: WriteGatewayListCodingUC.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f30846a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f30847b;

    /* JADX INFO: compiled from: WriteGatewayListCodingUC.kt */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f30848a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final f f30849b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Y<S0> f30850c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Y<S0> f30851d;

        public a(String str, f gatewayControlUnit, Y<S0> newStatuses, Y<S0> oldStatuses) {
            i.e(gatewayControlUnit, "gatewayControlUnit");
            i.e(newStatuses, "newStatuses");
            i.e(oldStatuses, "oldStatuses");
            this.f30848a = str;
            this.f30849b = gatewayControlUnit;
            this.f30850c = newStatuses;
            this.f30851d = oldStatuses;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return i.a(this.f30848a, aVar.f30848a) && i.a(this.f30849b, aVar.f30849b) && i.a(this.f30850c, aVar.f30850c) && i.a(this.f30851d, aVar.f30851d);
        }

        public final int hashCode() {
            return this.f30851d.hashCode() + ((this.f30850c.hashCode() + ((this.f30849b.hashCode() + (this.f30848a.hashCode() * 31)) * 31)) * 31);
        }

        public final String toString() {
            return "Params(vehicleId=" + this.f30848a + ", gatewayControlUnit=" + this.f30849b + ", newStatuses=" + this.f30850c + ", oldStatuses=" + this.f30851d + ")";
        }
    }

    public d(j jVar, c cVar) {
        this.f30846a = jVar;
        this.f30847b = cVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(T0 t8, a aVar, ContinuationImpl continuationImpl) {
        WriteGatewayListCodingUC$handleResponse$1 writeGatewayListCodingUC$handleResponse$1;
        d dVar;
        if (continuationImpl instanceof WriteGatewayListCodingUC$handleResponse$1) {
            writeGatewayListCodingUC$handleResponse$1 = (WriteGatewayListCodingUC$handleResponse$1) continuationImpl;
            int i10 = writeGatewayListCodingUC$handleResponse$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                writeGatewayListCodingUC$handleResponse$1.label = i10 - Integer.MIN_VALUE;
            } else {
                writeGatewayListCodingUC$handleResponse$1 = new WriteGatewayListCodingUC$handleResponse$1(this, continuationImpl);
            }
        } else {
            writeGatewayListCodingUC$handleResponse$1 = new WriteGatewayListCodingUC$handleResponse$1(this, continuationImpl);
        }
        Object objA = writeGatewayListCodingUC$handleResponse$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i11 = writeGatewayListCodingUC$handleResponse$1.label;
        if (i11 != 0) {
            if (i11 == 1) {
                aVar = (a) writeGatewayListCodingUC$handleResponse$1.L$2;
                t8 = (T0) writeGatewayListCodingUC$handleResponse$1.L$1;
                dVar = (d) writeGatewayListCodingUC$handleResponse$1.L$0;
                kotlin.b.b(objA);
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.b.b(objA);
            }
        }
        kotlin.b.b(objA);
        int i12 = t8.f42677c;
        if (i12 != 0) {
            return i12 == Nrc.f30498d.a() ? new C8.a.C0024a(new SecurityAccessException()) : new C8.a.C0024a(new Throwable("Failed gateway coding"));
        }
        long j = aVar.f30849b.j();
        writeGatewayListCodingUC$handleResponse$1.L$0 = this;
        writeGatewayListCodingUC$handleResponse$1.L$1 = t8;
        writeGatewayListCodingUC$handleResponse$1.L$2 = aVar;
        writeGatewayListCodingUC$handleResponse$1.label = 1;
        if (I.b(j, writeGatewayListCodingUC$handleResponse$1) == coroutineSingletons) {
            return coroutineSingletons;
        }
        dVar = this;
        f fVar = aVar.f30849b;
        c cVar = dVar.f30847b;
        writeGatewayListCodingUC$handleResponse$1.L$0 = null;
        writeGatewayListCodingUC$handleResponse$1.L$1 = null;
        writeGatewayListCodingUC$handleResponse$1.L$2 = null;
        writeGatewayListCodingUC$handleResponse$1.label = 2;
        objA = cVar.a(fVar, t8, writeGatewayListCodingUC$handleResponse$1);
        return objA == coroutineSingletons ? coroutineSingletons : objA;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object b(a aVar, ContinuationImpl continuationImpl) {
        WriteGatewayListCodingUC$invoke$1 writeGatewayListCodingUC$invoke$1;
        d dVar;
        a aVar2;
        if (continuationImpl instanceof WriteGatewayListCodingUC$invoke$1) {
            writeGatewayListCodingUC$invoke$1 = (WriteGatewayListCodingUC$invoke$1) continuationImpl;
            int i10 = writeGatewayListCodingUC$invoke$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                writeGatewayListCodingUC$invoke$1.label = i10 - Integer.MIN_VALUE;
            } else {
                writeGatewayListCodingUC$invoke$1 = new WriteGatewayListCodingUC$invoke$1(this, continuationImpl);
            }
        } else {
            writeGatewayListCodingUC$invoke$1 = new WriteGatewayListCodingUC$invoke$1(this, continuationImpl);
        }
        Object objB = writeGatewayListCodingUC$invoke$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i11 = writeGatewayListCodingUC$invoke$1.label;
        if (i11 != 0) {
            if (i11 == 1) {
                aVar2 = (a) writeGatewayListCodingUC$invoke$1.L$1;
                dVar = (d) writeGatewayListCodingUC$invoke$1.L$0;
                kotlin.b.b(objB);
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.b.b(objB);
            }
        }
        kotlin.b.b(objB);
        Y<S0> y10 = aVar.f30849b.f29426D;
        i.b(y10);
        String str = aVar.f30848a;
        f gatewayControlUnit = aVar.f30849b;
        i.e(gatewayControlUnit, "gatewayControlUnit");
        Y<S0> newStatuses = aVar.f30850c;
        i.e(newStatuses, "newStatuses");
        a aVar3 = new a(str, gatewayControlUnit, newStatuses, y10);
        writeGatewayListCodingUC$invoke$1.L$0 = this;
        writeGatewayListCodingUC$invoke$1.L$1 = aVar3;
        writeGatewayListCodingUC$invoke$1.label = 1;
        objB = this.f30846a.b(gatewayControlUnit, newStatuses, writeGatewayListCodingUC$invoke$1);
        if (objB == coroutineSingletons) {
            return coroutineSingletons;
        }
        dVar = this;
        aVar2 = aVar3;
        C8.a aVar4 = (C8.a) objB;
        if (!(aVar4 instanceof C8.a.b)) {
            if (aVar4 instanceof C8.a.C0024a) {
                return aVar4;
            }
            throw new NoWhenBranchMatchedException();
        }
        T0 t8 = (T0) ((C8.a.b) aVar4).f2463a;
        writeGatewayListCodingUC$invoke$1.L$0 = null;
        writeGatewayListCodingUC$invoke$1.L$1 = null;
        writeGatewayListCodingUC$invoke$1.label = 2;
        objB = dVar.a(t8, aVar2, writeGatewayListCodingUC$invoke$1);
        return objB == coroutineSingletons ? coroutineSingletons : objB;
    }
}
