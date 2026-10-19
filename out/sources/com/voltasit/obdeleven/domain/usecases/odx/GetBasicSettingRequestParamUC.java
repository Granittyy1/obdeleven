package com.voltasit.obdeleven.domain.usecases.odx;

import com.obdeleven.service.model.ControlUnit;
import com.obdeleven.service.odx.OdxFactory$Exception;
import com.obdeleven.service.odx.Param;
import com.voltasit.obdeleven.presentation.basicsettings.CheckNetworkConnection;
import com.voltasit.obdeleven.presentation.basicsettings.DescriptionNotFound;
import com.voltasit.obdeleven.presentation.basicsettings.SomethingWentWrong;
import kotlinx.coroutines.C2680e;
import kotlinx.coroutines.N;

/* JADX INFO: compiled from: GetBasicSettingRequestParamUC.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class GetBasicSettingRequestParamUC {
    public static final C8.a.C0024a a(GetBasicSettingRequestParamUC getBasicSettingRequestParamUC, Exception exc) {
        getBasicSettingRequestParamUC.getClass();
        if (!(exc instanceof OdxFactory$Exception)) {
            return new C8.a.C0024a(new SomethingWentWrong());
        }
        int iA = ((OdxFactory$Exception) exc).a();
        if (iA != 0) {
            return iA != 1 ? new C8.a.C0024a(new SomethingWentWrong()) : new C8.a.C0024a(new DescriptionNotFound());
        }
        return new C8.a.C0024a(new CheckNetworkConnection());
    }

    public final Object b(ControlUnit controlUnit, int i10, kotlin.coroutines.c<? super C8.a<? extends Param>> cVar) {
        return C2680e.f(N.f43198a, new GetBasicSettingRequestParamUC$invoke$2(controlUnit, this, i10, null), cVar);
    }
}
