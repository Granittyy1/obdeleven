package androidx.media3.datasource;

import android.net.Uri;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.MulticastSocket;
import java.net.SocketTimeoutException;
import p140l1.a;
import p140l1.e;

/* JADX INFO: loaded from: classes.dex */
public final class UdpDataSource extends a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f17931e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final byte[] f17932f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final DatagramPacket f17933g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Uri f17934h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public DatagramSocket f17935i;
    public MulticastSocket j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public InetAddress f17936k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f17937l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f17938m;

    public static final class UdpDataSourceException extends DataSourceException {
    }

    public UdpDataSource() {
        super(true);
        this.f17931e = 8000;
        byte[] bArr = new byte[2000];
        this.f17932f = bArr;
        this.f17933g = new DatagramPacket(bArr, 0, 2000);
    }

    @Override // p140l1.d
    public final void close() {
        this.f17934h = null;
        MulticastSocket multicastSocket = this.j;
        if (multicastSocket != null) {
            try {
                InetAddress inetAddress = this.f17936k;
                inetAddress.getClass();
                multicastSocket.leaveGroup(inetAddress);
            } catch (IOException unused) {
            }
            this.j = null;
        }
        DatagramSocket datagramSocket = this.f17935i;
        if (datagramSocket != null) {
            datagramSocket.close();
            this.f17935i = null;
        }
        this.f17936k = null;
        this.f17938m = 0;
        if (this.f17937l) {
            this.f17937l = false;
            l();
        }
    }

    @Override // p140l1.d
    public final long f(e eVar) throws UdpDataSourceException {
        Uri uri = eVar.f44168a;
        this.f17934h = uri;
        String host = uri.getHost();
        host.getClass();
        int port = this.f17934h.getPort();
        m(eVar);
        try {
            this.f17936k = InetAddress.getByName(host);
            InetSocketAddress inetSocketAddress = new InetSocketAddress(this.f17936k, port);
            if (this.f17936k.isMulticastAddress()) {
                MulticastSocket multicastSocket = new MulticastSocket(inetSocketAddress);
                this.j = multicastSocket;
                multicastSocket.joinGroup(this.f17936k);
                this.f17935i = this.j;
            } else {
                this.f17935i = new DatagramSocket(inetSocketAddress);
            }
            this.f17935i.setSoTimeout(this.f17931e);
            this.f17937l = true;
            n(eVar);
            return -1L;
        } catch (IOException e10) {
            throw new UdpDataSourceException(2001, e10);
        } catch (SecurityException e11) {
            throw new UdpDataSourceException(2006, e11);
        }
    }

    @Override // p140l1.d
    public final Uri getUri() {
        return this.f17934h;
    }

    @Override // p078g1.i
    public final int read(byte[] bArr, int i10, int i11) throws UdpDataSourceException {
        if (i11 == 0) {
            return 0;
        }
        int i12 = this.f17938m;
        DatagramPacket datagramPacket = this.f17933g;
        if (i12 == 0) {
            try {
                DatagramSocket datagramSocket = this.f17935i;
                datagramSocket.getClass();
                datagramSocket.receive(datagramPacket);
                int length = datagramPacket.getLength();
                this.f17938m = length;
                k(length);
            } catch (SocketTimeoutException e10) {
                throw new UdpDataSourceException(2002, e10);
            } catch (IOException e11) {
                throw new UdpDataSourceException(2001, e11);
            }
        }
        int length2 = datagramPacket.getLength();
        int i13 = this.f17938m;
        int iMin = Math.min(i13, i11);
        System.arraycopy(this.f17932f, length2 - i13, bArr, i10, iMin);
        this.f17938m -= iMin;
        return iMin;
    }
}
