package V;

import java.text.CharacterIterator;

/* JADX INFO: compiled from: CharSequenceCharacterIterator.android.kt */
/* JADX INFO: loaded from: classes.dex */
public final class q implements CharacterIterator {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CharSequence f6638b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f6639c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f6640d = 0;

    public q(CharSequence charSequence, int i10) {
        this.f6638b = charSequence;
        this.f6639c = i10;
    }

    @Override // java.text.CharacterIterator
    public final Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException unused) {
            throw new InternalError();
        }
    }

    @Override // java.text.CharacterIterator
    public final char current() {
        int i10 = this.f6640d;
        if (i10 == this.f6639c) {
            return (char) 65535;
        }
        return this.f6638b.charAt(i10);
    }

    @Override // java.text.CharacterIterator
    public final char first() {
        this.f6640d = 0;
        return current();
    }

    @Override // java.text.CharacterIterator
    public final int getBeginIndex() {
        return 0;
    }

    @Override // java.text.CharacterIterator
    public final int getEndIndex() {
        return this.f6639c;
    }

    @Override // java.text.CharacterIterator
    public final int getIndex() {
        return this.f6640d;
    }

    @Override // java.text.CharacterIterator
    public final char last() {
        int i10 = this.f6639c;
        if (i10 == 0) {
            this.f6640d = i10;
            return (char) 65535;
        }
        int i11 = i10 - 1;
        this.f6640d = i11;
        return this.f6638b.charAt(i11);
    }

    @Override // java.text.CharacterIterator
    public final char next() {
        int i10 = this.f6640d + 1;
        this.f6640d = i10;
        int i11 = this.f6639c;
        if (i10 < i11) {
            return this.f6638b.charAt(i10);
        }
        this.f6640d = i11;
        return (char) 65535;
    }

    @Override // java.text.CharacterIterator
    public final char previous() {
        int i10 = this.f6640d;
        if (i10 <= 0) {
            return (char) 65535;
        }
        int i11 = i10 - 1;
        this.f6640d = i11;
        return this.f6638b.charAt(i11);
    }

    @Override // java.text.CharacterIterator
    public final char setIndex(int i10) {
        if (i10 > this.f6639c || i10 < 0) {
            throw new IllegalArgumentException("invalid position");
        }
        this.f6640d = i10;
        return current();
    }
}
