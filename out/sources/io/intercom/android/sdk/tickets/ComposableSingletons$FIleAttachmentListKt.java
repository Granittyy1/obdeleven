package io.intercom.android.sdk.tickets;

import androidx.compose.foundation.layout.U;
import androidx.compose.foundation.layout.W;
import androidx.compose.material3.IconKt;
import androidx.compose.runtime.InterfaceC1084f;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.models.FileType;
import io.intercom.android.sdk.models.Ticket;
import io.intercom.android.sdk.ui.theme.IntercomTheme;

/* JADX INFO: compiled from: FIleAttachmentList.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class ComposableSingletons$FIleAttachmentListKt {
    public static final ComposableSingletons$FIleAttachmentListKt INSTANCE = new ComposableSingletons$FIleAttachmentListKt();

    /* JADX INFO: renamed from: lambda-1, reason: not valid java name */
    public static Ia.q<U, InterfaceC1084f, Integer, p293xa.r> f286lambda1 = new ComposableLambdaImpl(false, 1721837306, new Ia.q<U, InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.tickets.ComposableSingletons$FIleAttachmentListKt$lambda-1$1
        @Override // Ia.q
        public /* bridge */ /* synthetic */ p293xa.r invoke(U u10, InterfaceC1084f interfaceC1084f, Integer num) {
            invoke(u10, interfaceC1084f, num.intValue());
            return p293xa.r.f47939a;
        }

        public final void invoke(U FileAttachment, InterfaceC1084f interfaceC1084f, int i10) {
            kotlin.jvm.internal.i.e(FileAttachment, "$this$FileAttachment");
            if ((i10 & 81) == 16 && interfaceC1084f.s()) {
                interfaceC1084f.w();
            } else {
                IconKt.a(U.c.a(R.drawable.intercom_ic_alert_circle, interfaceC1084f, 0), "Error Icon", W.m(androidx.compose.ui.h.a.f13984b, 16), IntercomTheme.INSTANCE.getColors(interfaceC1084f, IntercomTheme.$stable).m633getError0d7_KjU(), interfaceC1084f, 440, 0);
            }
        }
    });

    /* JADX INFO: renamed from: lambda-2, reason: not valid java name */
    public static Ia.p<InterfaceC1084f, Integer, p293xa.r> f287lambda2 = new ComposableLambdaImpl(false, 597838424, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.tickets.ComposableSingletons$FIleAttachmentListKt$lambda-2$1
        @Override // Ia.p
        public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC1084f interfaceC1084f, Integer num) {
            invoke(interfaceC1084f, num.intValue());
            return p293xa.r.f47939a;
        }

        public final void invoke(InterfaceC1084f interfaceC1084f, int i10) {
            if ((i10 & 11) == 2 && interfaceC1084f.s()) {
                interfaceC1084f.w();
            } else {
                FIleAttachmentListKt.FileAttachmentList(null, kotlin.collections.l.s(new Ticket.TicketAttribute.FilesAttribute.File("", "image.png", "https://www.google.com", FileType.IMAGE), new Ticket.TicketAttribute.FilesAttribute.File("", "video.mp4", "https://www.google.com", FileType.VIDEO), new Ticket.TicketAttribute.FilesAttribute.File("", "attachment.pdf", "https://www.google.com", FileType.ATTACHMENT)), interfaceC1084f, 0, 1);
            }
        }
    });

    /* JADX INFO: renamed from: getLambda-1$intercom_sdk_base_release, reason: not valid java name */
    public final Ia.q<U, InterfaceC1084f, Integer, p293xa.r> m458getLambda1$intercom_sdk_base_release() {
        return f286lambda1;
    }

    /* JADX INFO: renamed from: getLambda-2$intercom_sdk_base_release, reason: not valid java name */
    public final Ia.p<InterfaceC1084f, Integer, p293xa.r> m459getLambda2$intercom_sdk_base_release() {
        return f287lambda2;
    }
}
