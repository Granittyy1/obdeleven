package io.intercom.android.sdk.m5.conversation.ui.components.row;

import androidx.compose.runtime.InterfaceC1084f;
import io.intercom.android.sdk.ui.component.ErrorMessageLayoutKt;
import java.util.List;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class G implements Ia.p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f38833b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.h f38834c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f38835d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f38836e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f38837f;

    public /* synthetic */ G(int i10, int i11, androidx.compose.ui.h hVar, String str) {
        this.f38837f = str;
        this.f38834c = hVar;
        this.f38835d = i10;
        this.f38836e = i11;
    }

    @Override // Ia.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f38833b) {
            case 0:
                return SpecialNoticeKt.SpecialNotice$lambda$1((String) this.f38837f, this.f38834c, this.f38835d, this.f38836e, (InterfaceC1084f) obj, ((Integer) obj2).intValue());
            default:
                return ErrorMessageLayoutKt.ErrorMessageLayout$lambda$2(this.f38834c, (List) this.f38837f, this.f38835d, this.f38836e, (InterfaceC1084f) obj, ((Integer) obj2).intValue());
        }
    }

    public /* synthetic */ G(androidx.compose.ui.h hVar, List list, int i10, int i11) {
        this.f38834c = hVar;
        this.f38837f = list;
        this.f38835d = i10;
        this.f38836e = i11;
    }
}
