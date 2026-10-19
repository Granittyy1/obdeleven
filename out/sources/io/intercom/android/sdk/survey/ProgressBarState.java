package io.intercom.android.sdk.survey;

import kotlin.jvm.internal.e;

/* JADX INFO: compiled from: SurveyViewModel.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class ProgressBarState {
    public static final int $stable = 0;
    private final boolean isVisible;
    private final float progress;

    public ProgressBarState() {
        this(false, 0.0f, 3, null);
    }

    public static /* synthetic */ ProgressBarState copy$default(ProgressBarState progressBarState, boolean z10, float f10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = progressBarState.isVisible;
        }
        if ((i10 & 2) != 0) {
            f10 = progressBarState.progress;
        }
        return progressBarState.copy(z10, f10);
    }

    public final boolean component1() {
        return this.isVisible;
    }

    public final float component2() {
        return this.progress;
    }

    public final ProgressBarState copy(boolean z10, float f10) {
        return new ProgressBarState(z10, f10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProgressBarState)) {
            return false;
        }
        ProgressBarState progressBarState = (ProgressBarState) obj;
        return this.isVisible == progressBarState.isVisible && Float.compare(this.progress, progressBarState.progress) == 0;
    }

    public final float getProgress() {
        return this.progress;
    }

    public int hashCode() {
        return Float.hashCode(this.progress) + (Boolean.hashCode(this.isVisible) * 31);
    }

    public final boolean isVisible() {
        return this.isVisible;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("ProgressBarState(isVisible=");
        sb2.append(this.isVisible);
        sb2.append(", progress=");
        return B7.b.d(sb2, this.progress, ')');
    }

    public ProgressBarState(boolean z10, float f10) {
        this.isVisible = z10;
        this.progress = f10;
    }

    public /* synthetic */ ProgressBarState(boolean z10, float f10, int i10, e eVar) {
        this((i10 & 1) != 0 ? false : z10, (i10 & 2) != 0 ? 0.0f : f10);
    }
}
