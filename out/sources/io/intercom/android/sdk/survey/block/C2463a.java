package io.intercom.android.sdk.survey.block;

import androidx.compose.runtime.InterfaceC1084f;
import io.intercom.android.sdk.blocks.lib.models.BlockAttachment;
import io.intercom.android.sdk.models.EmptyState;
import io.intercom.android.sdk.tickets.list.ui.TicketsEmptyScreenKt;

/* JADX INFO: renamed from: io.intercom.android.sdk.survey.block.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C2463a implements Ia.p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f39464b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.h f39465c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f39466d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f39467e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f39468f;

    public /* synthetic */ C2463a(androidx.compose.ui.h hVar, BlockAttachment blockAttachment, int i10, int i11) {
        this.f39465c = hVar;
        this.f39468f = blockAttachment;
        this.f39466d = i10;
        this.f39467e = i11;
    }

    @Override // Ia.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f39464b) {
            case 0:
                return AttachmentBlockKt.VideoAttachmentBlock$lambda$6(this.f39465c, (BlockAttachment) this.f39468f, this.f39466d, this.f39467e, (InterfaceC1084f) obj, ((Integer) obj2).intValue());
            default:
                return TicketsEmptyScreenKt.TicketsEmptyScreen$lambda$0((EmptyState) this.f39468f, this.f39465c, this.f39466d, this.f39467e, (InterfaceC1084f) obj, ((Integer) obj2).intValue());
        }
    }

    public /* synthetic */ C2463a(EmptyState emptyState, androidx.compose.ui.h hVar, int i10, int i11) {
        this.f39468f = emptyState;
        this.f39465c = hVar;
        this.f39466d = i10;
        this.f39467e = i11;
    }
}
