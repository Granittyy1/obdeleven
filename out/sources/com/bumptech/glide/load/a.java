package com.bumptech.glide.load;

import E3.h;
import com.bumptech.glide.load.resource.bitmap.RecyclableBufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

/* JADX INFO: compiled from: ImageHeaderParserUtils.java */
/* JADX INFO: loaded from: classes.dex */
public final class a {
    public static int a(h hVar, InputStream inputStream, ArrayList arrayList) throws IOException {
        if (inputStream == null) {
            return -1;
        }
        if (!inputStream.markSupported()) {
            inputStream = new RecyclableBufferedInputStream(inputStream, hVar);
        }
        inputStream.mark(5242880);
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            try {
                int iC = ((ImageHeaderParser) arrayList.get(i10)).c(inputStream, hVar);
                inputStream.reset();
                if (iC != -1) {
                    return iC;
                }
            } catch (Throwable th) {
                inputStream.reset();
                throw th;
            }
        }
        return -1;
    }

    public static ImageHeaderParser.ImageType b(h hVar, InputStream inputStream, ArrayList arrayList) throws IOException {
        if (inputStream == null) {
            return ImageHeaderParser.ImageType.UNKNOWN;
        }
        if (!inputStream.markSupported()) {
            inputStream = new RecyclableBufferedInputStream(inputStream, hVar);
        }
        inputStream.mark(5242880);
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            try {
                ImageHeaderParser.ImageType imageTypeB = ((ImageHeaderParser) arrayList.get(i10)).b(inputStream);
                inputStream.reset();
                if (imageTypeB != ImageHeaderParser.ImageType.UNKNOWN) {
                    return imageTypeB;
                }
            } catch (Throwable th) {
                inputStream.reset();
                throw th;
            }
        }
        return ImageHeaderParser.ImageType.UNKNOWN;
    }
}
