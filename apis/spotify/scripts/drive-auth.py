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
    token = "BQCmKaOkkOLKOOKbu2t-VmB1y6TD3zKjWhokbo9bllRnm59HPayED9tTo15n0hIB3Zo9j_UCFr34kVOxSmyD2izCl0iCSAr83Z54uRZgInwctWW35GM"
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
        "duration": 600
    }

    print(json.dumps(rtg_info))

if __name__ == "__main__":
    main()
