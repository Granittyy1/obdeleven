package com.voltasit.obdeleven.domain.usecases.device.requests;

import J8.p;
import com.voltasit.obdeleven.domain.exceptions.InvalidVinException;
import java.util.Arrays;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.i;
import kotlin.text.m;
import kotlin.text.n;

/* JADX INFO: compiled from: RequestVinKwp1281UC.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p f30811a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.voltasit.obdeleven.domain.usecases.device.p f30812b;

    public d(p pVar, com.voltasit.obdeleven.domain.usecases.device.p pVar2) {
        this.f30811a = pVar;
        this.f30812b = pVar2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object a(short s10, ContinuationImpl continuationImpl) {
        RequestVinKwp1281UC$invoke$1 requestVinKwp1281UC$invoke$1;
        if (continuationImpl instanceof RequestVinKwp1281UC$invoke$1) {
            requestVinKwp1281UC$invoke$1 = (RequestVinKwp1281UC$invoke$1) continuationImpl;
            int i10 = requestVinKwp1281UC$invoke$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                requestVinKwp1281UC$invoke$1.label = i10 - Integer.MIN_VALUE;
            } else {
                requestVinKwp1281UC$invoke$1 = new RequestVinKwp1281UC$invoke$1(this, continuationImpl);
            }
        } else {
            requestVinKwp1281UC$invoke$1 = new RequestVinKwp1281UC$invoke$1(this, continuationImpl);
        }
        Object objA = requestVinKwp1281UC$invoke$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i11 = requestVinKwp1281UC$invoke$1.label;
        if (i11 == 0) {
            kotlin.b.b(objA);
            this.f30811a.f("RequestVinKwp1281UC", "requestVinKWP1281()");
            requestVinKwp1281UC$invoke$1.label = 1;
            objA = this.f30812b.a("00", requestVinKwp1281UC$invoke$1, s10);
            if (objA == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.b.b(objA);
        }
        C8.a aVar = (C8.a) objA;
        if (!(aVar instanceof C8.a.b)) {
            if (aVar instanceof C8.a.C0024a) {
                return aVar;
            }
            throw new NoWhenBranchMatchedException();
        }
        String str = (String) ((C8.a.b) aVar).f2463a;
        if (m.I(str, "0A", false)) {
            return new C8.a.C0024a(new InvalidVinException(str));
        }
        String strSubstring = str.substring(2, 4);
        i.d(strSubstring, "substring(...)");
        O.h.c(16);
        Integer num = new Integer(Integer.parseInt(strSubstring, 16) & 127);
        String strSubstring2 = str.substring(4);
        i.d(strSubstring2, "substring(...)");
        String strB = com.obdeleven.service.util.b.b(String.format("%02X%s", Arrays.copyOf(new Object[]{num, strSubstring2}, 2)));
        i.d(strB, "convertHexToString(...)");
        String str2 = ((String[]) n.e0(strB, new String[]{" "}, 0, 6).toArray(new String[0]))[0];
        return str2.length() == 17 ? new C8.a.b(str2) : new C8.a.C0024a(new InvalidVinException(str2));
    }
}
