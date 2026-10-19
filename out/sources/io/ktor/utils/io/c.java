package io.ktor.utils.io;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: ByteReadChannelJVM.kt */
/* JADX INFO: loaded from: classes.dex */
public final class c {
    public static final Object a(ByteReadChannel byteReadChannel, d dVar, long j, ContinuationImpl continuationImpl) {
        if (byteReadChannel == dVar) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (j == 0) {
            return new Long(0L);
        }
        if ((byteReadChannel instanceof ByteBufferChannel) && (dVar instanceof ByteBufferChannel)) {
            return ((ByteBufferChannel) dVar).n((ByteBufferChannel) byteReadChannel, j, continuationImpl);
        }
        return ((byteReadChannel instanceof b) && (dVar instanceof b)) ? io.ktor.utils.io.internal.h.a((b) byteReadChannel, (b) dVar, Long.MAX_VALUE, continuationImpl) : b(byteReadChannel, dVar, j, continuationImpl);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x008b A[Catch: all -> 0x00f1, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x00f1, blocks: (B:37:0x00e7, B:39:0x00ed, B:25:0x008b), top: B:56:0x00e7 }] */
    /* JADX WARN: Code duplicated, block: B:27:0x00af A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:28:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:31:0x00c3 A[Catch: all -> 0x0046, TRY_LEAVE, TryCatch #2 {all -> 0x0046, blocks: (B:13:0x003e, B:29:0x00ba, B:31:0x00c3, B:46:0x0100, B:20:0x0065), top: B:58:0x0024 }] */
    /* JADX WARN: Code duplicated, block: B:33:0x00d9 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:34:0x00da  */
    /* JADX WARN: Code duplicated, block: B:39:0x00ed A[Catch: all -> 0x00f1, TRY_LEAVE, TryCatch #1 {all -> 0x00f1, blocks: (B:37:0x00e7, B:39:0x00ed, B:25:0x008b), top: B:56:0x00e7 }] */
    /* JADX WARN: Code duplicated, block: B:44:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:56:0x00e7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v3, types: [int] */
    /* JADX WARN: Type inference failed for: r10v9 */
    /* JADX WARN: Type inference failed for: r17v0 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v4, types: [int] */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x00da -> B:35:0x00e3). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object b(io.ktor.utils.io.ByteReadChannel r19, io.ktor.utils.io.d r20, long r21, kotlin.coroutines.jvm.internal.ContinuationImpl r23) {
        /*
            Method dump skipped, instruction units count: 282
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.c.b(io.ktor.utils.io.ByteReadChannel, io.ktor.utils.io.d, long, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
