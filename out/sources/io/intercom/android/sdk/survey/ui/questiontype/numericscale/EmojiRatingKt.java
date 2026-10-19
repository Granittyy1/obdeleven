package io.intercom.android.sdk.survey.ui.questiontype.numericscale;

import Ia.p;
import android.content.Context;
import android.graphics.ColorMatrixColorFilter;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.W;
import androidx.compose.runtime.C1086g;
import androidx.compose.runtime.C1105p0;
import androidx.compose.runtime.InterfaceC1084f;
import androidx.compose.runtime.O0;
import androidx.compose.ui.graphics.J;
import androidx.compose.ui.graphics.K;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import coil.compose.AsyncImagePainter;
import io.intercom.android.sdk.m5.components.C2289k0;
import io.intercom.android.sdk.m5.conversation.ui.components.Y;
import io.intercom.android.sdk.ui.coil.IntercomImageLoaderKt;
import me.zhanghai.android.materialprogressbar.R;
import p293xa.r;

/* JADX INFO: compiled from: EmojiRating.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class EmojiRatingKt {
    /* JADX WARN: Code duplicated, block: B:36:0x0070  */
    /* JADX WARN: Code duplicated, block: B:38:0x0074  */
    /* JADX WARN: Code duplicated, block: B:40:0x0078  */
    /* JADX WARN: Code duplicated, block: B:42:0x007e  */
    /* JADX WARN: Code duplicated, block: B:43:0x0081  */
    /* JADX WARN: Code duplicated, block: B:51:0x0099 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:52:0x009b  */
    /* JADX WARN: Code duplicated, block: B:55:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:56:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:60:0x010e  */
    /* JADX WARN: Code duplicated, block: B:62:? A[RETURN, SYNTHETIC] */
    public static final void EmojiRating(final String emojiUrl, final String contentDescription, boolean z10, final androidx.compose.ui.h modifier, InterfaceC1084f interfaceC1084f, final int i10, final int i11) {
        int i12;
        boolean z11;
        int i13;
        int i14;
        float f10;
        final boolean z12;
        C1105p0 c1105p0V;
        kotlin.jvm.internal.i.e(emojiUrl, "emojiUrl");
        kotlin.jvm.internal.i.e(contentDescription, "contentDescription");
        kotlin.jvm.internal.i.e(modifier, "modifier");
        C1086g c1086gP = interfaceC1084f.p(-538688650);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            i12 = (c1086gP.K(emojiUrl) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i11 & 2) != 0) {
            i12 |= 48;
        } else if ((i10 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 0) {
            i12 |= c1086gP.K(contentDescription) ? 32 : 16;
        }
        int i15 = i11 & 4;
        if (i15 == 0) {
            if ((i10 & 896) == 0) {
                z11 = z10;
                i12 |= c1086gP.c(z11) ? 256 : 128;
            }
            if ((i11 & 8) != 0) {
                i12 |= 3072;
            } else if ((i10 & 7168) == 0) {
                if (c1086gP.K(modifier)) {
                    i13 = 2048;
                } else {
                    i13 = 1024;
                }
                i12 |= i13;
            }
            i14 = i12;
            if ((i14 & 5851) == 1170 || !c1086gP.s()) {
                if (i15 != 0) {
                    z11 = true;
                }
                O0 o10 = AndroidCompositionLocals_androidKt.f14793b;
                coil.f imageLoader = IntercomImageLoaderKt.getImageLoader((Context) c1086gP.x(o10));
                c1086gP.e(1750824323);
                coil.request.g.a aVar = new coil.request.g.a((Context) c1086gP.x(o10));
                aVar.f23074c = emojiUrl;
                aVar.b();
                AsyncImagePainter asyncImagePainterA = coil.compose.f.a(aVar.a(), imageLoader, null, null, null, 0, c1086gP, R.styleable.AppCompatTheme_windowMinWidthMajor);
                c1086gP.T(false);
                float[] fArrA = J.a();
                if (z11) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                J.b(f10, fArrA);
                r rVar = r.f47939a;
                K k10 = new K(new ColorMatrixColorFilter(fArrA));
                k10.f13508b = fArrA;
                ImageKt.a(asyncImagePainterA, contentDescription, modifier, null, null, 0.0f, k10, c1086gP, (i14 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | ((i14 >> 3) & 896), 56);
                z12 = z11;
            } else {
                c1086gP.w();
                z12 = z11;
            }
            c1105p0V = c1086gP.V();
            if (c1105p0V != null) {
                c1105p0V.f13109d = new p() { // from class: io.intercom.android.sdk.survey.ui.questiontype.numericscale.c
                    @Override // Ia.p
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return EmojiRatingKt.EmojiRating$lambda$2(emojiUrl, contentDescription, z12, modifier, i10, i11, (InterfaceC1084f) obj, iIntValue);
                    }
                };
            }
        }
        i12 |= 384;
        z11 = z10;
        if ((i11 & 8) != 0) {
            i12 |= 3072;
        } else if ((i10 & 7168) == 0) {
            if (c1086gP.K(modifier)) {
                i13 = 2048;
            } else {
                i13 = 1024;
            }
            i12 |= i13;
        }
        i14 = i12;
        if ((i14 & 5851) == 1170) {
            if (i15 != 0) {
                z11 = true;
            }
            O0 o11 = AndroidCompositionLocals_androidKt.f14793b;
            coil.f imageLoader2 = IntercomImageLoaderKt.getImageLoader((Context) c1086gP.x(o11));
            c1086gP.e(1750824323);
            coil.request.g.a aVar2 = new coil.request.g.a((Context) c1086gP.x(o11));
            aVar2.f23074c = emojiUrl;
            aVar2.b();
            AsyncImagePainter asyncImagePainterA2 = coil.compose.f.a(aVar2.a(), imageLoader2, null, null, null, 0, c1086gP, R.styleable.AppCompatTheme_windowMinWidthMajor);
            c1086gP.T(false);
            float[] fArrA2 = J.a();
            if (z11) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            J.b(f10, fArrA2);
            r rVar2 = r.f47939a;
            K k11 = new K(new ColorMatrixColorFilter(fArrA2));
            k11.f13508b = fArrA2;
            ImageKt.a(asyncImagePainterA2, contentDescription, modifier, null, null, 0.0f, k11, c1086gP, (i14 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | ((i14 >> 3) & 896), 56);
            z12 = z11;
        } else {
            if (i15 != 0) {
                z11 = true;
            }
            O0 o12 = AndroidCompositionLocals_androidKt.f14793b;
            coil.f imageLoader3 = IntercomImageLoaderKt.getImageLoader((Context) c1086gP.x(o12));
            c1086gP.e(1750824323);
            coil.request.g.a aVar3 = new coil.request.g.a((Context) c1086gP.x(o12));
            aVar3.f23074c = emojiUrl;
            aVar3.b();
            AsyncImagePainter asyncImagePainterA3 = coil.compose.f.a(aVar3.a(), imageLoader3, null, null, null, 0, c1086gP, R.styleable.AppCompatTheme_windowMinWidthMajor);
            c1086gP.T(false);
            float[] fArrA3 = J.a();
            if (z11) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            J.b(f10, fArrA3);
            r rVar3 = r.f47939a;
            K k12 = new K(new ColorMatrixColorFilter(fArrA3));
            k12.f13508b = fArrA3;
            ImageKt.a(asyncImagePainterA3, contentDescription, modifier, null, null, 0.0f, k12, c1086gP, (i14 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | ((i14 >> 3) & 896), 56);
            z12 = z11;
        }
        c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new p() { // from class: io.intercom.android.sdk.survey.ui.questiontype.numericscale.c
                @Override // Ia.p
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return EmojiRatingKt.EmojiRating$lambda$2(emojiUrl, contentDescription, z12, modifier, i10, i11, (InterfaceC1084f) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final r EmojiRating$lambda$2(String emojiUrl, String contentDescription, boolean z10, androidx.compose.ui.h modifier, int i10, int i11, InterfaceC1084f interfaceC1084f, int i12) {
        kotlin.jvm.internal.i.e(emojiUrl, "$emojiUrl");
        kotlin.jvm.internal.i.e(contentDescription, "$contentDescription");
        kotlin.jvm.internal.i.e(modifier, "$modifier");
        EmojiRating(emojiUrl, contentDescription, z10, modifier, interfaceC1084f, L4.b.l(i10 | 1), i11);
        return r.f47939a;
    }

    public static final void SelectedEmoji(InterfaceC1084f interfaceC1084f, int i10) {
        C1086g c1086gP = interfaceC1084f.p(1230381561);
        if (i10 == 0 && c1086gP.s()) {
            c1086gP.w();
        } else {
            EmojiRating("https://js.intercomcdn.com/images/emojis/v2/72x72/1f929.png", "🤩", true, W.m(androidx.compose.ui.h.a.f13984b, 44), c1086gP, 3510, 0);
        }
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new C2289k0(i10, 4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final r SelectedEmoji$lambda$3(int i10, InterfaceC1084f interfaceC1084f, int i11) {
        SelectedEmoji(interfaceC1084f, L4.b.l(i10 | 1));
        return r.f47939a;
    }

    public static final void UnSelectedEmoji(InterfaceC1084f interfaceC1084f, int i10) {
        C1086g c1086gP = interfaceC1084f.p(2043776160);
        if (i10 == 0 && c1086gP.s()) {
            c1086gP.w();
        } else {
            EmojiRating("https://js.intercomcdn.com/images/emojis/v2/72x72/1f929.png", "🤩", false, W.m(androidx.compose.ui.h.a.f13984b, 44), c1086gP, 3510, 0);
        }
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new Y(i10, 3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final r UnSelectedEmoji$lambda$4(int i10, InterfaceC1084f interfaceC1084f, int i11) {
        UnSelectedEmoji(interfaceC1084f, L4.b.l(i10 | 1));
        return r.f47939a;
    }
}
