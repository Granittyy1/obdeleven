package io.intercom.android.sdk.post;

import Ia.l;
import Ia.p;
import Ia.q;
import androidx.compose.runtime.InterfaceC1084f;
import androidx.compose.ui.h;
import io.intercom.android.sdk.survey.ui.questiontype.files.FileAttachmentListKt;
import java.util.List;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class f implements p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f39450b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f39451c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f39452d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p293xa.e f39453e;

    public /* synthetic */ f(Object obj, p293xa.e eVar, int i10, int i11) {
        this.f39450b = i11;
        this.f39452d = obj;
        this.f39453e = eVar;
        this.f39451c = i10;
    }

    @Override // Ia.p
    public final Object invoke(Object obj, Object obj2) {
        int i10 = this.f39450b;
        InterfaceC1084f interfaceC1084f = (InterfaceC1084f) obj;
        int iIntValue = ((Integer) obj2).intValue();
        switch (i10) {
            case 0:
                return PostActivityV2Kt.BottomBarContent$lambda$5((h) this.f39452d, (q) this.f39453e, this.f39451c, interfaceC1084f, iIntValue);
            default:
                return FileAttachmentListKt.FileAttachmentList$lambda$4((List) this.f39452d, (l) this.f39453e, this.f39451c, interfaceC1084f, iIntValue);
        }
    }
}
