package com.voltasit.obdeleven.presentation.controlUnit.kwp.coding;

import android.content.DialogInterface;
import androidx.compose.foundation.lazy.p;
import io.intercom.android.sdk.ui.preview.ui.PreviewUriKt;
import java.util.List;
import p293xa.r;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class d implements Ia.l {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f31727b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f31728c;

    public /* synthetic */ d(int i10, Object obj) {
        this.f31727b = i10;
        this.f31728c = obj;
    }

    @Override // Ia.l
    public final Object invoke(Object obj) {
        switch (this.f31727b) {
            case 0:
                ((m) this.f31728c).getClass();
                ((DialogInterface) obj).dismiss();
                return r.f47939a;
            default:
                return PreviewUriKt.PdfPreview$lambda$13((List) this.f31728c, (p) obj);
        }
    }
}
