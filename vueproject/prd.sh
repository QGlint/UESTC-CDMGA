echo "删除 /var/www/CDMGA-ui ..."
rm -rf /var/www/CDMGA-ui

# 第二步：复制文件夹
echo "复制文件到 /var/www/CDMGA-ui ..."
cp -r /home/eu/CDMGA-s/UESTC-CDMGA/vueproject /var/www/CDMGA-ui

echo "操作完成！"
