package com.voltasit.obdeleven.domain.usecases.controlUnit;

import J8.p;
import androidx.compose.ui.text.font.s;
import com.voltasit.obdeleven.domain.exceptions.UnsupportedProtocolException;
import com.voltasit.obdeleven.domain.models.ProtocolType;
import com.voltasit.obdeleven.domain.models.RequestSID;
import com.voltasit.obdeleven.domain.usecases.C2112a;
import java.util.Arrays;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.i;

/* JADX INFO: compiled from: WriteDataByIdentifierUC.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C2112a f30753a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p084g8.c f30754b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p f30755c;

    public h(C2112a c2112a, p084g8.c cVar, p pVar) {
        this.f30753a = c2112a;
        this.f30754b = cVar;
        this.f30755c = pVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object a(String str, ContinuationImpl continuationImpl, short s10) {
        WriteDataByIdentifierUC$invoke$1 writeDataByIdentifierUC$invoke$1;
        h hVar;
        if (continuationImpl instanceof WriteDataByIdentifierUC$invoke$1) {
            writeDataByIdentifierUC$invoke$1 = (WriteDataByIdentifierUC$invoke$1) continuationImpl;
            int i10 = writeDataByIdentifierUC$invoke$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                writeDataByIdentifierUC$invoke$1.label = i10 - Integer.MIN_VALUE;
            } else {
                writeDataByIdentifierUC$invoke$1 = new WriteDataByIdentifierUC$invoke$1(this, continuationImpl);
            }
        } else {
            writeDataByIdentifierUC$invoke$1 = new WriteDataByIdentifierUC$invoke$1(this, continuationImpl);
        }
        Object objB = writeDataByIdentifierUC$invoke$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i11 = writeDataByIdentifierUC$invoke$1.label;
        if (i11 == 0) {
            kotlin.b.b(objB);
            String str2 = String.format("%02X", Arrays.copyOf(new Object[]{new Integer(RequestSID.WriteDataByIdentifier.a() & 255)}, 1));
            try {
                short s11 = s10;
                if (this.f30754b.c(s11) instanceof com.obdeleven.service.protocol.b) {
                    ProtocolType.a aVar = ProtocolType.f30505b;
                    return new C8.a.C0024a(new UnsupportedProtocolException());
                }
                String strB = s.b(str2, str);
                writeDataByIdentifierUC$invoke$1.L$0 = this;
                writeDataByIdentifierUC$invoke$1.label = 1;
                objB = this.f30753a.b(strB, writeDataByIdentifierUC$invoke$1, s11);
                if (objB == coroutineSingletons) {
                    return coroutineSingletons;
                }
                hVar = this;
            } catch (Exception e10) {
                this.f30755c.d(e10, true);
                return new C8.a.C0024a(e10);
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            hVar = (h) writeDataByIdentifierUC$invoke$1.L$0;
            kotlin.b.b(objB);
        }
        C8.a aVar2 = (C8.a) objB;
        if (aVar2 instanceof C8.a.b) {
            String strSubstring = ((String) ((C8.a.b) aVar2).f2463a).substring(6);
            i.d(strSubstring, "substring(...)");
            return new C8.a.b(strSubstring);
        }
        if (!(aVar2 instanceof C8.a.C0024a)) {
            throw new NoWhenBranchMatchedException();
        }
        hVar.f30755c.b("WriteDataByIdentifierUC", "bluetooth request failed: " + ((C8.a.C0024a) aVar2).f2462a.getMessage());
        return aVar2;
    }
}
