package io.intercom.android.sdk.utilities.coil;

import Z2.e;
import android.graphics.Bitmap;
import io.intercom.android.sdk.m5.components.avatar.AvatarIconKt;
import io.intercom.android.sdk.m5.components.avatar.AvatarShape;
import kotlin.coroutines.c;
import kotlin.jvm.internal.i;
import p006a5.a;
import p016b3.d;
import p270w.f;

/* JADX INFO: compiled from: AvatarShapeTransformation.kt */
/* JADX INFO: loaded from: classes.dex */
public final class AvatarShapeTransformation implements d {
    public static final int $stable = 0;
    private final AvatarShape avatarShape;

    public AvatarShapeTransformation(AvatarShape avatarShape) {
        i.e(avatarShape, "avatarShape");
        this.avatarShape = avatarShape;
    }

    @Override // p016b3.d
    public String getCacheKey() {
        return this.avatarShape.name() + AvatarShapeTransformation.class.getName();
    }

    @Override // p016b3.d
    public Object transform(Bitmap bitmap, e eVar, c<? super Bitmap> cVar) {
        f composeShape = AvatarIconKt.getComposeShape(this.avatarShape);
        float width = bitmap.getWidth();
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(bitmap.getHeight())) & 4294967295L) | (Float.floatToRawIntBits(width) << 32);
        p013b0.d dVarA = a.a();
        return new p016b3.c(composeShape.f47673a.a(jFloatToRawIntBits, dVarA), composeShape.f47674b.a(jFloatToRawIntBits, dVarA), composeShape.f47676d.a(jFloatToRawIntBits, dVarA), composeShape.f47675c.a(jFloatToRawIntBits, dVarA)).transform(bitmap, eVar, cVar);
    }
}
