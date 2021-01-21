using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace WindowsFormsApp4
{
    public partial class Form1 : DevExpress.XtraBars.Ribbon.RibbonForm
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void barButtonItem1_ItemClick(object sender, DevExpress.XtraBars.ItemClickEventArgs e)
        {
            System.Diagnostics.Process.Start(@"C:\Users\GURBUZ\source\repos\WindowsFormsApp4\WindowsFormsApp4\bin\Debug\Stenografi_uygulama\JavaApplication31\dist\encrypt_decrypt_dosya.jar");
        }

        private void barButtonItem7_ItemClick(object sender, DevExpress.XtraBars.ItemClickEventArgs e)
        {
            System.Diagnostics.Process.Start(@"C:\Users\GURBUZ\source\repos\WindowsFormsApp4\WindowsFormsApp4\bin\Debug\Stenografi_uygulama\JavaApplication31\dist\video_cikar.jar");
        }

        private void barButtonItem9_ItemClick(object sender, DevExpress.XtraBars.ItemClickEventArgs e)
        {
            System.Diagnostics.Process.Start(@"C:\Users\GURBUZ\source\repos\WindowsFormsApp4\WindowsFormsApp4\bin\Debug\Stenografi_uygulama\ImageStegano.jar");
        }

        private void barButtonItem3_ItemClick(object sender, DevExpress.XtraBars.ItemClickEventArgs e)
        {
            System.Diagnostics.Process.Start(@"C:\Users\GURBUZ\source\repos\WindowsFormsApp4\WindowsFormsApp4\bin\Debug\Stenografi_uygulama\JavaApplication31\dist\zip.jar");
        }

        private void barButtonItem4_ItemClick(object sender, DevExpress.XtraBars.ItemClickEventArgs e)
        {
            System.Diagnostics.Process.Start(@"C:\Users\GURBUZ\source\repos\WindowsFormsApp4\WindowsFormsApp4\bin\Debug\Stenografi_uygulama\JavaApplication31\dist\sikistir.jar");
        }

        private void barButtonItem5_ItemClick(object sender, DevExpress.XtraBars.ItemClickEventArgs e)
        {
            System.Diagnostics.Process.Start(@"C:\Users\GURBUZ\source\repos\WindowsFormsApp4\WindowsFormsApp4\bin\Debug\Stenografi_uygulama\JavaApplication31\dist\genislet.jar");
        }

        private void barButtonItem6_ItemClick(object sender, DevExpress.XtraBars.ItemClickEventArgs e)
        {
            System.Diagnostics.Process.Start(@"C:\Users\GURBUZ\source\repos\WindowsFormsApp4\WindowsFormsApp4\bin\Debug\Stenografi_uygulama\JavaApplication31\dist\video_gom.jar");
        }

        private void barButtonItem8_ItemClick(object sender, DevExpress.XtraBars.ItemClickEventArgs e)
        {
            System.Diagnostics.Process.Start(@"C:\Users\GURBUZ\source\repos\WindowsFormsApp4\WindowsFormsApp4\bin\Debug\Stenografi_uygulama\AudioSteganography.jar");
        }

        private void barButtonItem10_ItemClick(object sender, DevExpress.XtraBars.ItemClickEventArgs e)
        {
            hakkimda hakk = new hakkimda();
            hakk.ShowDialog();
        }

        private void barButtonItem11_ItemClick(object sender, DevExpress.XtraBars.ItemClickEventArgs e)
        {
            sifreleme sifre = new sifreleme();
            sifre.ShowDialog();
        }
    }
}
