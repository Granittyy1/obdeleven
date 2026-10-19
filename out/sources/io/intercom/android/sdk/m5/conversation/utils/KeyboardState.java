package io.intercom.android.sdk.m5.conversation.utils;

import A1.C0575j;
import androidx.compose.animation.D;
import kotlin.jvm.internal.e;
import p005a4.q;

/* JADX INFO: compiled from: KeyboardState.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class KeyboardState {
    public static final int $stable = 0;
    private final int bottomDiff;
    private final boolean isAnimating;
    private final boolean isDismissed;
    private final boolean isVisible;
    private final int keyboardHeight;

    public KeyboardState() {
        this(false, 0, false, false, 0, 31, null);
    }

    public static /* synthetic */ KeyboardState copy$default(KeyboardState keyboardState, boolean z10, int i10, boolean z11, boolean z12, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            z10 = keyboardState.isAnimating;
        }
        if ((i12 & 2) != 0) {
            i10 = keyboardState.bottomDiff;
        }
        int i13 = i10;
        if ((i12 & 4) != 0) {
            z11 = keyboardState.isVisible;
        }
        boolean z13 = z11;
        if ((i12 & 8) != 0) {
            z12 = keyboardState.isDismissed;
        }
        boolean z14 = z12;
        if ((i12 & 16) != 0) {
            i11 = keyboardState.keyboardHeight;
        }
        return keyboardState.copy(z10, i13, z13, z14, i11);
    }

    public final boolean component1() {
        return this.isAnimating;
    }

    public final int component2() {
        return this.bottomDiff;
    }

    public final boolean component3() {
        return this.isVisible;
    }

    public final boolean component4() {
        return this.isDismissed;
    }

    public final int component5() {
        return this.keyboardHeight;
    }

    public final KeyboardState copy(boolean z10, int i10, boolean z11, boolean z12, int i11) {
        return new KeyboardState(z10, i10, z11, z12, i11);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof KeyboardState)) {
            return false;
        }
        KeyboardState keyboardState = (KeyboardState) obj;
        return this.isAnimating == keyboardState.isAnimating && this.bottomDiff == keyboardState.bottomDiff && this.isVisible == keyboardState.isVisible && this.isDismissed == keyboardState.isDismissed && this.keyboardHeight == keyboardState.keyboardHeight;
    }

    public final int getBottomDiff() {
        return this.bottomDiff;
    }

    public final int getKeyboardHeight() {
        return this.keyboardHeight;
    }

    public int hashCode() {
        return Integer.hashCode(this.keyboardHeight) + D.b(D.b(q.b(this.bottomDiff, Boolean.hashCode(this.isAnimating) * 31, 31), 31, this.isVisible), 31, this.isDismissed);
    }

    public final boolean isAnimating() {
        return this.isAnimating;
    }

    public final boolean isDismissed() {
        return this.isDismissed;
    }

    public final boolean isVisible() {
        return this.isVisible;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("KeyboardState(isAnimating=");
        sb2.append(this.isAnimating);
        sb2.append(", bottomDiff=");
        sb2.append(this.bottomDiff);
        sb2.append(", isVisible=");
        sb2.append(this.isVisible);
        sb2.append(", isDismissed=");
        sb2.append(this.isDismissed);
        sb2.append(", keyboardHeight=");
        return C0575j.b(sb2, this.keyboardHeight, ')');
    }

    public KeyboardState(boolean z10, int i10, boolean z11, boolean z12, int i11) {
        this.isAnimating = z10;
        this.bottomDiff = i10;
        this.isVisible = z11;
        this.isDismissed = z12;
        this.keyboardHeight = i11;
    }

    public /* synthetic */ KeyboardState(boolean z10, int i10, boolean z11, boolean z12, int i11, int i12, e eVar) {
        this((i12 & 1) != 0 ? false : z10, (i12 & 2) != 0 ? 0 : i10, (i12 & 4) != 0 ? false : z11, (i12 & 8) != 0 ? false : z12, (i12 & 16) != 0 ? 0 : i11);
    }
}
