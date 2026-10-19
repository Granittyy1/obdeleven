package androidx.profileinstaller;

/* JADX INFO: loaded from: classes.dex */
enum FileSectionType {
    f19458b("DEX_FILES"),
    /* JADX INFO: Fake field, exist only in values array */
    EF1("EXTRA_DESCRIPTORS"),
    f19459c("CLASSES"),
    f19460d("METHODS"),
    /* JADX INFO: Fake field, exist only in values array */
    EF53("AGGREGATION_COUNT");

    private final long mValue;

    FileSectionType(String str) {
        this.mValue = j;
    }

    public final long a() {
        return this.mValue;
    }
}
