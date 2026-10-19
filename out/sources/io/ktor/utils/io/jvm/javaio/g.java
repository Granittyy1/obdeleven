package io.ktor.utils.io.jvm.javaio;

import kotlin.jvm.internal.i;
import kotlinx.coroutines.AbstractC2712w;

/* JADX INFO: compiled from: Blocking.kt */
/* JADX INFO: loaded from: classes.dex */
public final class g extends AbstractC2712w {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final g f40651c = new g();

    @Override // kotlinx.coroutines.AbstractC2712w
    public final void Z0(kotlin.coroutines.e context, Runnable block) {
        i.e(context, "context");
        i.e(block, "block");
        block.run();
    }

    @Override // kotlinx.coroutines.AbstractC2712w
    public final boolean b1(kotlin.coroutines.e context) {
        i.e(context, "context");
        return true;
    }
}
