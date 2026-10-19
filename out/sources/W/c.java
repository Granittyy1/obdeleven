package W;

import C.g;
import java.text.BreakIterator;

/* JADX INFO: compiled from: SegmentFinder.android.kt */
/* JADX INFO: loaded from: classes.dex */
public final class c extends g {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final BreakIterator f6991c;

    public c(CharSequence charSequence) {
        BreakIterator characterInstance = BreakIterator.getCharacterInstance();
        characterInstance.setText(charSequence.toString());
        this.f6991c = characterInstance;
    }

    @Override // C.g
    public final int Y(int i10) {
        return this.f6991c.following(i10);
    }

    @Override // C.g
    public final int f0(int i10) {
        return this.f6991c.preceding(i10);
    }
}
