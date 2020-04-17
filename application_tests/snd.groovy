def main(graph) {
    sh script: '''
      istioctl manifest apply -f profiles/snd/snd.yml
      kubectl apply -f profiles/snd/ingress.yml
    '''
}
return this