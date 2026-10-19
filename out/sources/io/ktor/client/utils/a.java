package io.ktor.client.utils;

import Ia.q;
import io.ktor.utils.io.ByteReadChannel;
import kotlin.coroutines.e;
import kotlin.jvm.internal.i;
import kotlinx.coroutines.C2673a0;

/* JADX INFO: compiled from: ByteChannelUtils.kt */
/* JADX INFO: loaded from: classes.dex */
public final class a {
    public static final io.ktor.utils.io.a a(ByteReadChannel byteReadChannel, e context, Long l10, q listener) {
        i.e(byteReadChannel, "<this>");
        i.e(context, "context");
        i.e(listener, "listener");
        return io.ktor.utils.io.i.a(C2673a0.f43223b, context, true, new ByteChannelUtilsKt$observable$1(l10, byteReadChannel, listener, null)).f40597c;
    }
}
