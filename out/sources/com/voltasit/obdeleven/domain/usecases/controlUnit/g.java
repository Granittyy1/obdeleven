package com.voltasit.obdeleven.domain.usecases.controlUnit;

import androidx.compose.ui.text.font.s;
import com.voltasit.obdeleven.domain.exceptions.UnsupportedProtocolException;
import com.voltasit.obdeleven.domain.models.ProtocolType;
import com.voltasit.obdeleven.domain.models.RequestSID;
import com.voltasit.obdeleven.domain.usecases.C2112a;
import java.util.Arrays;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: RoutineControlUC.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C2112a f30751a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p084g8.c f30752b;

    public g(C2112a c2112a, p084g8.c cVar) {
        this.f30751a = c2112a;
        this.f30752b = cVar;
    }

    public final Object a(String str, ContinuationImpl continuationImpl, short s10) {
        String str2 = String.format("%02X", Arrays.copyOf(new Object[]{new Integer(RequestSID.RoutineControl.a() & 255)}, 1));
        try {
            if (this.f30752b.c(s10) instanceof com.obdeleven.service.protocol.b) {
                ProtocolType.a aVar = ProtocolType.f30505b;
                return new C8.a.C0024a(new UnsupportedProtocolException());
            }
            return this.f30751a.b(s.b(str2, str), continuationImpl, s10);
        } catch (Exception e10) {
            return new C8.a.C0024a(e10);
        }
    }
}
