package androidx.compose.ui.platform;

/* JADX INFO: compiled from: ViewConfiguration.kt */
/* JADX INFO: loaded from: classes.dex */
public interface Y0 {
    long a();

    long b();

    default float c() {
        return 2.0f;
    }

    default long d() {
        float f10 = 48;
        return kotlinx.coroutines.C.c(f10, f10);
    }

    default float e() {
        return Float.MAX_VALUE;
    }

    float f();

    default float g() {
        return 16.0f;
    }
}
