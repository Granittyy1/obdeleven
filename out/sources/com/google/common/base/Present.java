package com.google.common.base;

/* JADX INFO: loaded from: classes3.dex */
final class Present<T> extends Optional<T> {
    private static final long serialVersionUID = 0;
    private final T reference;

    public Present(T t8) {
        this.reference = t8;
    }

    @Override // com.google.common.base.Optional
    public final T b() {
        return this.reference;
    }

    @Override // com.google.common.base.Optional
    public final boolean c() {
        return true;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof Present) {
            return this.reference.equals(((Present) obj).reference);
        }
        return false;
    }

    public final int hashCode() {
        return this.reference.hashCode() + 1502476572;
    }

    public final String toString() {
        return "Optional.of(" + this.reference + ")";
    }
}
