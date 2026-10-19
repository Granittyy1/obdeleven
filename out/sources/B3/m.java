package B3;

import android.os.ParcelFileDescriptor;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import java.io.IOException;

/* JADX INFO: compiled from: ParcelFileDescriptorRewinder.java */
/* JADX INFO: loaded from: classes.dex */
public final class m implements e<ParcelFileDescriptor> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f1521a;

    /* JADX INFO: compiled from: ParcelFileDescriptorRewinder.java */
    public static final class a implements e.a<ParcelFileDescriptor> {
        @Override // B3.e.a
        public final Class<ParcelFileDescriptor> a() {
            return ParcelFileDescriptor.class;
        }

        @Override // B3.e.a
        public final e<ParcelFileDescriptor> b(ParcelFileDescriptor parcelFileDescriptor) {
            return new m(parcelFileDescriptor);
        }
    }

    /* JADX INFO: compiled from: ParcelFileDescriptorRewinder.java */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ParcelFileDescriptor f1522a;

        public b(ParcelFileDescriptor parcelFileDescriptor) {
            this.f1522a = parcelFileDescriptor;
        }
    }

    public m(ParcelFileDescriptor parcelFileDescriptor) {
        this.f1521a = new b(parcelFileDescriptor);
    }

    @Override // B3.e
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final ParcelFileDescriptor a() throws IOException {
        ParcelFileDescriptor parcelFileDescriptor = this.f1521a.f1522a;
        try {
            Os.lseek(parcelFileDescriptor.getFileDescriptor(), 0L, OsConstants.SEEK_SET);
            return parcelFileDescriptor;
        } catch (ErrnoException e10) {
            throw new IOException(e10);
        }
    }

    @Override // B3.e
    public final void b() {
    }
}
