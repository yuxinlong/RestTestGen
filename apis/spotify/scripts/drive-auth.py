import json
import requests

def main():
    # 设置请求参数
    url = "https://accounts.spotify.com/api/token"
    headers = {"Content-Type": "application/x-www-form-urlencoded"}
    data = {
        "grant_type": "client_credentials",
        "client_id": "70eb87ccaaae4af88c70caa4ecb6cd91",
        "client_secret": "76e9098cff5045a98eea88aa70ffc218"
    }
    # token = "BQBeS86QqcviaS6aE0b7AfZROOJQ11j9LR_pUd5ANES_oSDzjq_82frYr2TaF6Wm9ytZwBz5yApCV2VNp0SEdrr6ZsyIxr0ZbG2tQew0xVuhJbBtkR0"
    # 发送 POST 请求
    response = requests.post(url, headers=headers, data=data, proxies={})
    if response.status_code == 200:
        # 解析 JSON 响应数据
        response_data = response.json()

    # 提取 access_token
        token = response_data.get("access_token")

    rtg_info = {
        "name": "Authorization",
        "value": "Bearer " + token,
        "in": "header",
        "duration": 3600
    }

    print(json.dumps(rtg_info))

if __name__ == "__main__":
    main()
